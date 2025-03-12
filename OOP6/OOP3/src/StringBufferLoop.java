
public class StringBufferLoop {

    public static void main(String[] args) {
    	
		long millis = System.currentTimeMillis();
		
		StringBuffer str = new StringBuffer();
	    for (int i = 0; i < 40000; i++) {
	      str.append("X");
	    }
	    
	    System.out.println("Dauer StringBuffer: "+(System.currentTimeMillis()-millis)+" ms");
	    
	    
	    // StringBuilder
	    millis = System.currentTimeMillis();
		
		StringBuilder strb = new StringBuilder();
	    for (int i = 0; i < 40000; i++) {
	      strb.append("X");
	    }
	    
	    System.out.println("Dauer StringBuilder: "+(System.currentTimeMillis()-millis)+" ms");
	    
	    
	    // String
	    millis = System.currentTimeMillis();
		
		String string = "";
	    for (int i = 0; i < 40000; i++) {
	      string += "X";
	    }
	    
	    System.out.println("Dauer String mit +: "+(System.currentTimeMillis()-millis)+" ms");
    
    // String
    millis = System.currentTimeMillis();
	
	string = "";
    for (int i = 0; i < 40000; i++) {
      string.concat("X");
    }
    
    System.out.println("Dauer String mit concat: "+(System.currentTimeMillis()-millis)+" ms");
    
    }
}
