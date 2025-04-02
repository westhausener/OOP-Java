public class Kreis extends GeometrischeFigur{

	private double radius;

	public Kreis(double radius){
		this.radius = radius;
	}
	
	@Override
	protected double berechneFlaeche() {
		return Math.PI * radius * radius;
	}

	@Override
	protected double berechneUmfang() {
		return 2 * Math.PI * radius;
	}

      
}
