
public class Aufg_03_02 {

	public static void main(String[] args) {
		
	    byte[] bArray = new byte[3];
	    
	    bArray[0] = 6;
	    bArray[1] = 7;
	    bArray[2] = 8;
	    
	    System.out.println("Wert 0: "+ bArray[0]);
	    System.out.println("Wert 1: "+ bArray[1]);
	    System.out.println("Wert 2: "+ bArray[2]);
	    
	    System.out.println("------------------------------------------");
	    
	    //-------------------------------------------------------------------------------------
	    Auto[] aArray = {new Auto(), new Auto(), new Auto()};
	    
	    aArray[0].hersteller = "VW";
	    aArray[0].ps = 146;
	    aArray[1].hersteller = "Volvo";
	    aArray[1].ps = 160;
	    aArray[2].hersteller = "Ford";
	    aArray[2].ps = 39;
	    
	    System.out.println("Auto 0: "+aArray[0].hersteller+" - PS: "+aArray[0].ps);
	    System.out.println("Auto 1: "+aArray[1].hersteller+" - PS: "+aArray[1].ps);
	    System.out.println("Auto 2: "+aArray[2].hersteller+" - PS: "+aArray[2].ps);
		

	}

}
