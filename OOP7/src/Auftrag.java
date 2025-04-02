
public class Auftrag {

	private String titel;
	private String auftragGeber;
	private int prioritaet;
	
	public Auftrag(String titel, String auftragGeber, int prioritaet){
		this.titel = titel;
		this.auftragGeber = auftragGeber;
		this.prioritaet = prioritaet;
	}
	
	public Auftrag(String titel, String auftragGeber){
		this(titel, auftragGeber, 3);
	}

	public String getTitel() {
		return titel;
	}

	public String getAuftragGeber() {
		return auftragGeber;
	}

	public int getPrioritaet() {
		return prioritaet;
	}
	
	
}
