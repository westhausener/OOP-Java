
public class Paket {

	private boolean zerbrechlich;
	private int gewicht;
	private String empfaenger;
	private boolean empfaengerChecked;

	// erster Konstruktor
	public Paket(int gewicht, String empfaenger, boolean zerbrechlich) {
		this.gewicht = gewicht;
		this.zerbrechlich = zerbrechlich;
		this.empfaenger = empfaenger;
		
		this.empfaengerChecked = checkEmpfaenger();
		insertLog(empfaenger);
		
	}

	// zweiter Konstruktor
	public Paket(int gewicht,  String empfaenger) {
		this.gewicht = gewicht;
		this.zerbrechlich = false;
		this.empfaenger = empfaenger;
		
		this.empfaengerChecked = checkEmpfaenger();
		insertLog(empfaenger);
	}
	
	//-----------------------------------------------------------------------------------------------
	private boolean checkEmpfaenger() {
		//...
		return true;
	}
	
	private void insertLog(String empfaenger){
		//...
	}

}