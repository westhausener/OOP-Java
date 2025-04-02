
public class TestFilm {

	public static void main(String[] args) {
		
		// 3 Film-Objekte
		// Der Herr der Ringe, Gandalf, 2001 
		// Star Trek, Mr. Spock, 1979 = 
		// ohne Parameter
		Film f1 = new Film("Der Herr der Ringe", "Gandalf", 2001);
		Film f2 = new Film("Star Trek", "Mr. Spock", 1979);
		Film f3 = new Film();

		
		// print-Methoden aufrufen
		f1.print();
		f2.print();
		f3.print();
	}

}
