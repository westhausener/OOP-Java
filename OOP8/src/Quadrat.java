
public class Quadrat extends GeometrischeFigur2d{

	private int laenge = 2;
	
	// Konstruktor
	public Quadrat(int x, int y, int laenge){
		this.x = x;
		this.y = y;
		this.laenge = laenge;
	}
	
	public void print(){
		System.out.println("x-Koordinate: "+this.x);
		System.out.println("y-Koordinate: "+this.y);
		System.out.println("Fläche des Quadrats: "+berechneFlaeche());
	}
	
	public static void main(String[] args) {
		
		Quadrat q = new Quadrat(10,20, 2);
		q.print();
	}

	@Override
	public int berechneFlaeche() {
		return laenge*laenge;
	}
	
}






