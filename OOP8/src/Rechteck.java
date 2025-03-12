
public class Rechteck extends GeometrischeFigur{

	private double laenge, breite;
	
	public Rechteck(double laenge, double breite){
		this.laenge = laenge;
		this.breite = breite;
	}

	@Override
	protected double berechneFlaeche() {
		return laenge * breite;
	}

	@Override
	protected double berechneUmfang() {
		return 2 * laenge + 2 * breite;
	}
	
	
	
}