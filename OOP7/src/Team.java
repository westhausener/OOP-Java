
public class Team {

	private String verein;
	private int punkte, tordifferenz;
	
	public Team(String verein, int punkte, int tordifferenz){
		this.verein = verein;
		this.punkte = punkte;
		this.tordifferenz = tordifferenz;
	}

	public String getVerein() {
		return verein;
	}

	public int getPunkte() {
		return punkte;
	}

	public int getTordifferenz() {
		return tordifferenz;
	}
		
}
