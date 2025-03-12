package OOP7;

public class Film2 {
	private String titel;
	private String figur;
	private int jahr;
	
	
	public Film2(String titel, String figur, int jahr) {
		this.titel = titel;
		this.figur = figur;
		this.jahr =jahr;
	}
	
	public Film2() {
		this.titel = "Kein Titel";
		this.figur = "Keine Figur";
		this.jahr = 0;
	}
	
	public void print()
	{
		System.out.println("Titel " + titel);
		System.out.println("Figur " + figur);
		System.out.println("Jahr " + jahr);
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	public String getFigur() {
		return figur;
	}
	public void setFigur(String figur) {
		this.figur = figur;
	}
	public int getJahr() {
		return jahr;
	}
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	

}
