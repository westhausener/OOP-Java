import java.awt.*;
import java.awt.event.*;

public class HochzeitsApp extends Frame {

    public HochzeitsApp() {
        setTitle("Hochzeits-Gästebuch");
        setSize(650, 480);
        setLayout(null);

        // Label + TextField
        Label nameLabel = new Label("Ihr Name:");
        nameLabel.setBounds(50, 50, 100, 20);
        TextField nameField = new TextField();
        nameField.setBounds(160, 50, 200, 20);

        // Checkbox (Teilnahme)
        Checkbox teilnehmen = new Checkbox("Ich nehme teil");
        teilnehmen.setBounds(160, 80, 150, 20);

        // CheckboxGroup (Radio-Buttons für Menüwahl)
        Label menuLabel = new Label("Essenswahl:");
        menuLabel.setBounds(50, 110, 100, 20);
        CheckboxGroup menuGruppe = new CheckboxGroup();
        Checkbox vegetarisch = new Checkbox("Vegetarisch", menuGruppe, true);
        vegetarisch.setBounds(160, 110, 100, 20);
        Checkbox fleisch = new Checkbox("Mit Fleisch", menuGruppe, false);
        fleisch.setBounds(270, 110, 100, 20);

        // Choice (Sitzplatz)
        Label platzLabel = new Label("Sitzplatz-Wunsch:");
        platzLabel.setBounds(50, 140, 120, 20);
        Choice platzWahl = new Choice();
        platzWahl.setBounds(180, 140, 150, 20);
        platzWahl.add("Fenster");
        platzWahl.add("Nähe Brautpaar");
        platzWahl.add("Tanzfläche");

        // List (Musikwünsche)
        Label musikLabel = new Label("Musikwünsche:");
        musikLabel.setBounds(50, 170, 100, 20);
        List musikListe = new List(4, true);
        musikListe.setBounds(160, 170, 200, 80);
        musikListe.add("Rock");
        musikListe.add("Pop");
        musikListe.add("Klassik");
        musikListe.add("Jazz");

        // TextArea für Grußtext
        Label grussLabel = new Label("Grußtext:");
        grussLabel.setBounds(50, 260, 100, 20);
        TextArea grussArea = new TextArea();
        grussArea.setBounds(160, 260, 250, 60);

        // Scrollbar (optional)
        Scrollbar dekorScroll = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
        dekorScroll.setBounds(160, 330, 250, 20);

        // Button
        Button senden = new Button("Eintrag senden");
        senden.setBounds(160, 360, 120, 30);

        // Canvas (Herz)
        Canvas herzCanvas = new Canvas() {
            public void paint(Graphics g) {
                g.setColor(Color.PINK);
                g.fillOval(20, 20, 40, 40);
                g.fillOval(40, 20, 40, 40);
                g.fillPolygon(new int[]{20, 60, 80}, new int[]{40, 100, 40}, 3);
            }
        };
        herzCanvas.setBackground(Color.WHITE);
        herzCanvas.setBounds(450, 60, 100, 100);

        // Hinzufügen aller Komponenten
        add(nameLabel); add(nameField);
        add(teilnehmen);
        add(menuLabel); add(vegetarisch); add(fleisch);
        add(platzLabel); add(platzWahl);
        add(musikLabel); add(musikListe);
        add(grussLabel); add(grussArea);
        add(dekorScroll);
        add(senden);
        add(herzCanvas);

        // Button-Event
        senden.addActionListener(e -> {
            String name = nameField.getText();
            String menu = menuGruppe.getSelectedCheckbox().getLabel();
            String gruss = grussArea.getText();
            System.out.println("Neuer Eintrag:");
            System.out.println("Name: " + name);
            System.out.println("Essenswahl: " + menu);
            System.out.println("Grußtext: " + gruss);
        });

        
        setVisible(true);
    }

    public static void main(String[] args) {
        new HochzeitsApp();
    }
}
