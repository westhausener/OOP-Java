package OOP7;

public class TestFilm {

	public static void main(String[] args) {
		
		// 3 Film-Objekte
		// Der Herr der Ringe, Gandalf, 2001 
		// Star Trek, Mr. Spock, 1979 = 
		// ohne Parameter
		Film2 f1 = new Film2("Der Herr der Ringe", "Gandalf", 2001);
		Film2 f2 = new Film2("Star Trek", "Mr. Spock", 1979);
		Film2 f3 = new Film2();

		
		// print-Methoden aufrufen
		f1.print();
		f2.print();
		f3.print();
	}

}
