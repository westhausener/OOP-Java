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
	protected double berechneUmfangkalipo() {
		return 2 * Math.PI * radius;
	
	}

	protected double calculatediameter() {
		return 2* radius;
	}
      
}
