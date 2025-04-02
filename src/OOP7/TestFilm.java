package OOP7;

public class TestFilm {

	public static void main(String[] args) {
		
		// 3 Film-Objekte
		// Der Herr der Ringe, Gandalf, 2001 
		// Star Trek, Mr. Spock, 1979 = 
		// ohne Parameter
		
		Film3 f1 = new Film3("Der Herr der Ringe", "Gandalf", 2001);
		Film3 f2 = new Film3("Star Trek", "Mr. Spock", 1979);
		Film3 f3 = new Film3();

		
		// print-Methoden aufrufen
		f1.print();
		f2.print();
		f3.print();
	}

}
