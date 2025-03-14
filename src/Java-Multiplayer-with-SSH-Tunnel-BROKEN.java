import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tictactoe extends JFrame {
    private static final int BOARD_SIZE = 3;
    private JButton[][] buttons = new JButton[BOARD_SIZE][BOARD_SIZE];
    private char currentPlayer = 'X';
    private char myPlayer;

    // GUI-Komponenten
    private JLabel statusLabel;
    private JButton resetButton;
    private JButton connectButton;
    private JTextField connectionField;
    private JTextArea consoleOutput;
    private JButton startServeoButton;
    private JTextField serveoSubdomainField;
    private JLabel serveoUrlLabel;

    // Netzwerk-Komponenten
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private ExecutorService executorService;
    private boolean isConnected = false;
    private boolean isServer = false;
    private Process serveoProcess;
    private String serveoUrl = "";

    // Server-Port
    private static final int SERVER_PORT = 5555;

    // Spielstatus
    private boolean gameActive = true;
    private boolean myTurn = false;

    public Tictactoe() {
        setTitle("Tic Tac Toe - Netzwerk-Multiplayer mit Serveo.net");
        setSize(500, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        executorService = Executors.newCachedThreadPool();

        // Spielbrett initialisieren
        JPanel boardPanel = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));
        initializeBoard(boardPanel);
        add(boardPanel, BorderLayout.CENTER);

        // Status-Panel mit Anzeige des aktuellen Spielers
        JPanel statusPanel = new JPanel();
        statusLabel = new JLabel("Nicht verbunden. Starte einen Server oder verbinde mit einem Spiel.");
        statusLabel.setFont(new Font("Arial", Font.BOLD, 14));
        statusPanel.add(statusLabel);
        add(statusPanel, BorderLayout.NORTH);

        // Tab-Panel für Verbindungsoptionen
        JPanel networkPanel = createNetworkPanel();

        // Console Output für Tunneling-Logs
        consoleOutput = new JTextArea(5, 40);
        consoleOutput.setEditable(false);
        consoleOutput.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scrollPane = new JScrollPane(consoleOutput);
        scrollPane.setBorder(BorderFactory.createTitledBorder("Verbindungs-Log"));

        // Hauptpanel für Verbindungen
        JPanel connectionMainPanel = new JPanel(new BorderLayout());
        connectionMainPanel.add(networkPanel, BorderLayout.CENTER);
        connectionMainPanel.add(scrollPane, BorderLayout.SOUTH);

        add(connectionMainPanel, BorderLayout.SOUTH);

        setLocationRelativeTo(null);

        // Bei Schließen des Fensters Verbindungen schließen
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                closeConnections();
                stopServeoTunnel();
            }
        });
    }

    private JPanel createNetworkPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 1));

        // Panel 1: Serveo Tunnel erstellen (Host) oder mit einem Spiel verbinden (Gast)
        JPanel connectionTypePanel = new JPanel(new GridLayout(1, 2));

        // Host-Panel (Serveo Tunnel starten)
        JPanel hostPanel = new JPanel(new BorderLayout());
        hostPanel.setBorder(BorderFactory.createTitledBorder("Host ein Spiel"));

        JPanel subdPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        subdPanel.add(new JLabel("Deine Subdomain:"));
        serveoSubdomainField = new JTextField("tictactoe-" + (int)(Math.random() * 10000), 15);
        subdPanel.add(serveoSubdomainField);

        JPanel hostButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        startServeoButton = new JButton("Spiel hosten");
        startServeoButton.addActionListener(e -> {
            if (startServeoButton.getText().equals("Spiel hosten")) {
                final String subdomain = serveoSubdomainField.getText();

                // Subdomain validieren
                if (!subdomain.matches("^[a-zA-Z0-9-]+$")) {
                    JOptionPane.showMessageDialog(this,
                            "Subdomain darf nur Buchstaben, Zahlen und Bindestriche enthalten.",
                            "Ungültige Subdomain", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Server starten und dann Serveo Tunnel starten
                startHostProcess(subdomain);
            } else {
                // Spiel beenden
                stopServeoTunnel();
                closeConnections();
                startServeoButton.setText("Spiel hosten");
                serveoUrlLabel.setText("URL: (nicht verbunden)");
                statusLabel.setText("Nicht verbunden.");
                resetConnectionState();
            }
        });
        hostButtonPanel.add(startServeoButton);

        JPanel urlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        serveoUrlLabel = new JLabel("URL: (nicht verbunden)");
        urlPanel.add(serveoUrlLabel);

        JPanel urlButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton copyUrlButton = new JButton("URL kopieren");
        copyUrlButton.addActionListener(e -> {
            if (!serveoUrl.isEmpty()) {
                copyToClipboard(serveoUrl);
                JOptionPane.showMessageDialog(this, "URL kopiert: " + serveoUrl);
            } else {
                JOptionPane.showMessageDialog(this, "Keine URL verfügbar. Starte zuerst einen Server.",
                        "Keine URL", JOptionPane.WARNING_MESSAGE);
            }
        });
        urlButtonPanel.add(copyUrlButton);

        JPanel hostInfoPanel = new JPanel();
        hostInfoPanel.setLayout(new BoxLayout(hostInfoPanel, BoxLayout.Y_AXIS));
        hostInfoPanel.add(subdPanel);
        hostInfoPanel.add(hostButtonPanel);
        hostInfoPanel.add(urlPanel);
        hostInfoPanel.add(urlButtonPanel);
        hostPanel.add(hostInfoPanel, BorderLayout.CENTER);

        // Verbindungs-Panel (als Gast beitreten)
        JPanel connectPanel = new JPanel(new BorderLayout());
        connectPanel.setBorder(BorderFactory.createTitledBorder("Einem Spiel beitreten"));

        JPanel connectFieldPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        connectFieldPanel.add(new JLabel("Spiel-URL:"));
        connectionField = new JTextField("", 20);
        connectFieldPanel.add(connectionField);

        JPanel connectButtonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        connectButton = new JButton("Verbinden");
        connectButton.addActionListener(e -> {
            final String connection = connectionField.getText().trim();

            if (connection.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bitte gib eine Spiel-URL ein.",
                        "Eingabe fehlt", JOptionPane.WARNING_MESSAGE);
                return;
            }

            String host = connection;
            // Entferne http:// oder https:// falls vorhanden
            if (host.startsWith("http://")) host = host.substring(7);
            if (host.startsWith("https://")) host = host.substring(8);

            // Falls nur Subdomain eingegeben wurde, .serveo.net anhängen
            if (!host.contains(".")) {
                host = host + ".serveo.net";
            }

            final String finalHost = host;

            // Als Client direkte Verbindung herstellen
            startDirectClientConnection(finalHost, SERVER_PORT);
        });
        connectButtonPanel.add(connectButton);

        JPanel connectHelpPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        connectHelpPanel.add(new JLabel("Gib die URL oder nur die Subdomain ein (z.B. tictactoe-1234)"));

        JPanel connectInfoPanel = new JPanel();
        connectInfoPanel.setLayout(new BoxLayout(connectInfoPanel, BoxLayout.Y_AXIS));
        connectInfoPanel.add(connectFieldPanel);
        connectInfoPanel.add(connectButtonPanel);
        connectInfoPanel.add(connectHelpPanel);
        connectPanel.add(connectInfoPanel, BorderLayout.CENTER);

        connectionTypePanel.add(hostPanel);
        connectionTypePanel.add(connectPanel);

        // Panel 2: Spielsteuerung
        JPanel gameControlPanel = new JPanel(new FlowLayout());
        gameControlPanel.setBorder(BorderFactory.createTitledBorder("Spielsteuerung"));

        resetButton = new JButton("Spiel zurücksetzen");
        resetButton.setEnabled(false);
        resetButton.addActionListener(e -> {
            if (isServer) {
                resetBoard();
                sendResetCommand();
            }
        });

        gameControlPanel.add(resetButton);

        // Panel 3: Anleitung
        JPanel instructionPanel = new JPanel(new BorderLayout());
        instructionPanel.setBorder(BorderFactory.createTitledBorder("Anleitung"));

        JTextArea instructionText = new JTextArea(
                "Als Host (X):\n" +
                        "1. Gib eine Subdomain ein und klicke auf 'Spiel hosten'\n" +
                        "2. Warte auf die Verbindungsbestätigung im Log\n" +
                        "3. Teile die URL mit deinem Mitspieler (Kopier-Button)\n\n" +
                        "Als Gast (O):\n" +
                        "1. Gib die URL oder Subdomain des Hosts ein\n" +
                        "2. Klicke auf 'Verbinden'\n" +
                        "3. Warte auf X's ersten Zug"
        );
        instructionText.setEditable(false);
        instructionText.setBackground(panel.getBackground());
        instructionText.setFont(new Font("SansSerif", Font.PLAIN, 12));
        instructionPanel.add(new JScrollPane(instructionText), BorderLayout.CENTER);

        // Alles zusammenfügen
        panel.add(connectionTypePanel);
        panel.add(gameControlPanel);
        panel.add(instructionPanel);

        return panel;
    }

    private void startHostProcess(String subdomain) {
        // 1. Einfachen TCP-Server starten
        executorService.submit(() -> {
            try {
                serverSocket = new ServerSocket(SERVER_PORT);

                SwingUtilities.invokeLater(() -> {
                    log("Lokaler Server auf Port " + SERVER_PORT + " gestartet.");
                });

                // 2. Serveo Tunnel starten
                startServeoTunnel(subdomain, SERVER_PORT);

                SwingUtilities.invokeLater(() -> {
                    statusLabel.setText("Tunnel gestartet. Warte auf Verbindung...");
                    isServer = true;
                    myPlayer = 'X';  // Server spielt X
                    myTurn = true;   // Server beginnt
                    connectButton.setEnabled(false);
                    startServeoButton.setText("Spiel beenden");
                });

                // 3. Warte auf Client-Verbindung
                clientSocket = serverSocket.accept();
                isConnected = true;

                // 4. Streams einrichten
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // 5. Sende ein Begrüßungspaket
                out.println("HELLO:SERVER");

                SwingUtilities.invokeLater(() -> {
                    statusLabel.setText("Spieler verbunden! Du bist X. Du beginnst.");
                    resetButton.setEnabled(true);
                    resetBoard();
                });

                // 6. Nachrichten vom Client empfangen
                receiveMessages();

            } catch (IOException e) {
                final String errorMsg = e.getMessage();
                SwingUtilities.invokeLater(() -> {
                    if (!errorMsg.contains("socket closed")) {
                        log("Fehler beim Starten des Servers: " + errorMsg);
                        statusLabel.setText("Serverfehler: " + errorMsg);
                        startServeoButton.setText("Spiel hosten");
                    }
                });
            }
        });
    }

    private void copyToClipboard(String text) {
        java.awt.datatransfer.StringSelection stringSelection = new java.awt.datatransfer.StringSelection(text);
        java.awt.datatransfer.Clipboard clipboard = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    private void startServeoTunnel(final String subdomain, final int localPort) {
        executorService.submit(() -> {
            try {
                log("Starte Serveo.net SSH-Tunnel für Subdomain: " + subdomain);
                log("Dies erfordert, dass SSH auf deinem System installiert ist.");

                // TCP-Port-Forwarding (kein HTTP, nur direktes TCP)
                final String command = "ssh -R " + subdomain + ":80:localhost:" + localPort + " serveo.net";
                log("Führe aus: " + command);

                ProcessBuilder processBuilder = new ProcessBuilder();
                if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                    processBuilder.command("cmd.exe", "/c", command);
                } else {
                    processBuilder.command("bash", "-c", command);
                }

                serveoProcess = processBuilder.start();

                // Tunnelausgabe lesen und nach "Forwarding" suchen
                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(serveoProcess.getInputStream()))) {
                    String line;
                    Pattern pattern = Pattern.compile("Forwarding TCP connections from ([\\w.-]+\\.serveo\\.net)");
                    if (!pattern.matcher("").matches()) {
                        // Wenn das TCP-Pattern nicht funktioniert, versuchen wir das HTTP-Pattern
                        pattern = Pattern.compile("Forwarding HTTP traffic from https?://([\\w.-]+\\.serveo\\.net)");
                    }

                    while ((line = reader.readLine()) != null) {
                        final String logLine = line;
                        SwingUtilities.invokeLater(() -> log(logLine));

                        // URL aus der Ausgabe extrahieren
                        Matcher matcher = pattern.matcher(line);
                        if (matcher.find()) {
                            final String url = matcher.group(1);
                            serveoUrl = url;
                            SwingUtilities.invokeLater(() -> {
                                serveoUrlLabel.setText("URL: " + url);
                                serveoUrlLabel.setForeground(Color.BLUE);
                            });
                        }
                    }
                }

                // Fehlerausgabe lesen
                try (BufferedReader errorReader = new BufferedReader(
                        new InputStreamReader(serveoProcess.getErrorStream()))) {
                    String line;
                    while ((line = errorReader.readLine()) != null) {
                        final String logLine = "FEHLER: " + line;
                        SwingUtilities.invokeLater(() -> log(logLine));
                    }
                }

                int exitCode = serveoProcess.waitFor();
                SwingUtilities.invokeLater(() -> {
                    log("Serveo-Prozess beendet mit Exitcode: " + exitCode);
                    serveoUrlLabel.setText("URL: (nicht verbunden)");
                    serveoUrlLabel.setForeground(Color.BLACK);
                    serveoUrl = "";
                });

            } catch (IOException | InterruptedException e) {
                final String errorMsg = e.getMessage();
                SwingUtilities.invokeLater(() -> {
                    log("Fehler beim Tunneln: " + errorMsg);
                    serveoUrlLabel.setText("URL: Fehler beim Verbinden");
                    serveoUrlLabel.setForeground(Color.RED);
                });
            }
        });
    }

    private void stopServeoTunnel() {
        if (serveoProcess != null && serveoProcess.isAlive()) {
            serveoProcess.destroy();
            log("Serveo-Tunnel gestoppt.");
        }
    }

    private void startDirectClientConnection(String host, int port) {
        executorService.submit(() -> {
            try {
                SwingUtilities.invokeLater(() -> {
                    statusLabel.setText("Verbinde mit " + host + "...");
                    log("Verbindungsversuch zu " + host);
                });

                // Versuche direkte TCP-Verbindung
                clientSocket = new Socket();
                clientSocket.connect(new InetSocketAddress(host, 80), 5000); // 5 Sekunden Timeout

                isConnected = true;

                // Streams einrichten
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                // Sende ein Begrüßungspaket
                out.println("HELLO:CLIENT");

                SwingUtilities.invokeLater(() -> {
                    statusLabel.setText("Verbunden mit Server! Du bist O. Warte auf X's Zug.");
                    connectButton.setEnabled(false);
                    myPlayer = 'O';  // Client spielt O
                    myTurn = false;  // X (Server) beginnt
                    gameActive = true;
                    log("Verbindung erfolgreich hergestellt!");
                });

                // Nachrichten vom Server empfangen
                receiveMessages();

            } catch (IOException e) {
                final String errorMsg = e.getMessage();
                SwingUtilities.invokeLater(() -> {
                    statusLabel.setText("Verbindungsfehler: " + errorMsg);
                    log("Verbindungsfehler: " + errorMsg);
                    log("Hinweis: Stelle sicher, dass die URL korrekt ist und der Host online ist.");
                });
            }
        });
    }

    private void receiveMessages() {
        try {
            String inputLine;
            log("Warte auf Nachrichten...");

            while ((inputLine = in.readLine()) != null) {
                final String message = inputLine;
                log("Nachricht empfangen: " + message);

                SwingUtilities.invokeLater(() -> processMessage(message));
            }

        } catch (IOException e) {
            final String errorMsg = e.getMessage();
            SwingUtilities.invokeLater(() -> {
                if (isConnected) {
                    statusLabel.setText("Verbindung unterbrochen: " + errorMsg);
                    log("Verbindung unterbrochen: " + errorMsg);
                    resetConnectionState();
                }
            });
        }
    }

    private void processMessage(String message) {
        log("Verarbeite Nachricht: " + message);

        if (message.startsWith("MOVE:")) {
            // Format: MOVE:row,col
            String[] parts = message.substring(5).split(",");
            try {
                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);

                // Zug des Gegners ausführen
                makeMove(row, col, (myPlayer == 'X') ? 'O' : 'X');
                myTurn = true;
                updateStatus();
            } catch (Exception e) {
                log("Fehler beim Verarbeiten des Zugs: " + e.getMessage());
            }

        } else if (message.equals("RESET")) {
            resetBoard();
        } else if (message.startsWith("HELLO:")) {
            log("Verbindung hergestellt: " + message);
        }
    }

    private void sendMove(int row, int col) {
        if (out != null) {
            final String moveMessage = "MOVE:" + row + "," + col;
            out.println(moveMessage);
            log("Sende Zug: " + moveMessage);
        } else {
            log("Fehler: Kann Zug nicht senden, keine Verbindung.");
        }
    }

    private void sendResetCommand() {
        if (out != null) {
            out.println("RESET");
            log("Sende Reset-Kommando");
        }
    }

    private void log(String message) {
        SwingUtilities.invokeLater(() -> {
            consoleOutput.append(message + "\n");
            consoleOutput.setCaretPosition(consoleOutput.getDocument().getLength());
        });
    }

    private void updateStatus() {
        if (!isConnected) {
            statusLabel.setText("Nicht verbunden.");
            return;
        }

        if (hasWon('X')) {
            statusLabel.setText("X hat gewonnen!");
            gameActive = false;
        } else if (hasWon('O')) {
            statusLabel.setText("O hat gewonnen!");
            gameActive = false;
        } else if (isBoardFull()) {
            statusLabel.setText("Unentschieden!");
            gameActive = false;
        } else if (myTurn) {
            statusLabel.setText("Du bist am Zug (" + myPlayer + ")");
        } else {
            statusLabel.setText("Warte auf Gegner...");
        }
    }

    private void initializeBoard(JPanel boardPanel) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                buttons[i][j] = new JButton("-");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 60));
                buttons[i][j].setFocusPainted(false);

                final int row = i;
                final int col = j;
                buttons[i][j].addActionListener(e -> {
                    if (isConnected && gameActive && myTurn && buttons[row][col].getText().equals("-")) {
                        makeMove(row, col, myPlayer);
                        sendMove(row, col);
                        myTurn = false;
                        updateStatus();
                    }
                });

                boardPanel.add(buttons[i][j]);
            }
        }
    }

    private void makeMove(int row, int col, char player) {
        buttons[row][col].setText(String.valueOf(player));

        // Farbe entsprechend des Spielers setzen
        if (player == 'X') {
            buttons[row][col].setForeground(Color.BLUE);
        } else {
            buttons[row][col].setForeground(Color.RED);
        }

        currentPlayer = player;

        // Prüfen, ob das Spiel gewonnen wurde
        if (hasWon(player)) {
            highlightWinningLine(player);
            gameActive = false;
        }

        updateStatus();
    }

    private boolean hasWon(char player) {
        // Zeilen und Spalten prüfen
        for (int i = 0; i < BOARD_SIZE; i++) {
            if ((buttons[i][0].getText().equals(String.valueOf(player)) &&
                    buttons[i][1].getText().equals(String.valueOf(player)) &&
                    buttons[i][2].getText().equals(String.valueOf(player))) ||
                    (buttons[0][i].getText().equals(String.valueOf(player)) &&
                            buttons[1][i].getText().equals(String.valueOf(player)) &&
                            buttons[2][i].getText().equals(String.valueOf(player)))) {
                return true;
            }
        }
        // Diagonalen prüfen
        if ((buttons[0][0].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][2].getText().equals(String.valueOf(player))) ||
                (buttons[0][2].getText().equals(String.valueOf(player)) &&
                        buttons[1][1].getText().equals(String.valueOf(player)) &&
                        buttons[2][0].getText().equals(String.valueOf(player)))) {
            return true;
        }
        return false;
    }

    private void highlightWinningLine(char player) {
        Color winColor = (player == 'X') ? new Color(173, 216, 230) : new Color(255, 192, 203);

        // Zeilen prüfen
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(player)) &&
                    buttons[i][1].getText().equals(String.valueOf(player)) &&
                    buttons[i][2].getText().equals(String.valueOf(player))) {
                buttons[i][0].setBackground(winColor);
                buttons[i][1].setBackground(winColor);
                buttons[i][2].setBackground(winColor);
                return;
            }
        }

        // Spalten prüfen
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (buttons[0][i].getText().equals(String.valueOf(player)) &&
                    buttons[1][i].getText().equals(String.valueOf(player)) &&
                    buttons[2][i].getText().equals(String.valueOf(player))) {
                buttons[0][i].setBackground(winColor);
                buttons[1][i].setBackground(winColor);
                buttons[2][i].setBackground(winColor);
                return;
            }
        }

        // Diagonale links oben nach rechts unten
        if (buttons[0][0].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][2].getText().equals(String.valueOf(player))) {
            buttons[0][0].setBackground(winColor);
            buttons[1][1].setBackground(winColor);
            buttons[2][2].setBackground(winColor);
            return;
        }

        // Diagonale rechts oben nach links unten
        if (buttons[0][2].getText().equals(String.valueOf(player)) &&
                buttons[1][1].getText().equals(String.valueOf(player)) &&
                buttons[2][0].getText().equals(String.valueOf(player))) {
            buttons[0][2].setBackground(winColor);
            buttons[1][1].setBackground(winColor);
            buttons[2][0].setBackground(winColor);
        }
    }

    private boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (buttons[i][j].getText().equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    private void resetBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                buttons[i][j].setText("-");
                buttons[i][j].setBackground(null);
                buttons[i][j].setForeground(Color.BLACK);
            }
        }

        currentPlayer = 'X';
        gameActive = true;

        if (isServer) {
            myTurn = true;
        } else {
            myTurn = false;
        }

        updateStatus();
    }

    private void resetConnectionState() {
        isConnected = false;
        gameActive = false;
        connectButton.setEnabled(true);
        resetButton.setEnabled(false);

        // Versuche, Verbindungen zu schließen
        closeConnections();
    }

    private void closeConnections() {
        try {
            if (in != null) in.close();
            if (out != null) out.close();
            if (clientSocket != null) clientSocket.close();
            if (serverSocket != null) serverSocket.close();
        } catch (IOException e) {
            System.err.println("Fehler beim Schließen der Verbindungen: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Tictactoe game = new Tictactoe();
            game.setVisible(true);
        });
    }
}
