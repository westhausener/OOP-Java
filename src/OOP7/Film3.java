public class Film3 {
    private String titel;
    private String figur;
    private int jahr;

    public Film3(String titel, String figur, int jahr) {
        this.titel = titel;
        this.figur = figur;
        this.jahr = jahr;
        
    }

    public Film3() {
        this("kein Titel", "Keine Figur", 0);
    }

    public void print() {
        System.out.println("Titel: " + titel);
        System.out.println("Figur: " + figur);
        System.out.println("Jahr: " + jahr);
        System.out.println("-----------------------");
    }
}
