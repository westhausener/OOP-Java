import java.util.Scanner;

public class Konto {
    private int kontostand;

    public void Einzahlen(int Kontostand) {
            Scanner input = new Scanner(System.in);
            System.out.print("Einzahlungsbetrag: ");
            int betrag = input.nextInt();
            if (betrag <= 0) {
                System.out.println("Negative Beträge einzuzahlen, geht nicht!");
            } else {
                this.kontostand += betrag;
            }
    }

    public void Auszahlen(int Kontostand) {
        Scanner input = new Scanner(System.in);
        System.out.print("Auszahlungsbetrag: ");
        int betrag = input.nextInt();
        if (betrag <= kontostand) {
            this.kontostand -= betrag;
        } else {
            System.out.println("Kein Geld für dich");
        }
    }

    public double getKontostand() {
        return this.kontostand;
    }


    public static void main(String[] args) {
        Konto meinKonto = new Konto();
        meinKonto.Einzahlen(0);
        System.out.println(meinKonto.getKontostand());
        meinKonto.Auszahlen(1);
        System.out.println(meinKonto.getKontostand());
    }
}
