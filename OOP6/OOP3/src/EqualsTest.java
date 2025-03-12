
public class EqualsTest {

	public static void main(String[] args) {
		
		// 2 Objekte, gleicher Inhalt
		//String a = new String("BVB");
		//String b = new String("BVB");
		
		// Zwecks Speicheroptimierung wird ein Objekt mit zwei Referenzen angelegt
	    String a = "BVB";
		String b = "BVB";
		
		if (a.equals(b))
		{
		    System.out.println("equals ist wahr");
		}

		if (a == b)
		{
		    System.out.println("== ist wahr");
		}

	}

}
