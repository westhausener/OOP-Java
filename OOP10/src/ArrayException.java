
public class ArrayException {

	public static void main (String[] args)
	   {
	      int[] intarr = new int [4];
	      for (int i = 0; i < 8; i++)
	      {
	  	  //intarr [i] = i;
	      //System.out.println (intarr [i]);
	    	
	         try
	         {
	            intarr [i] = i;
	            System.out.println (intarr [i]);
	         }
	         catch (ArrayIndexOutOfBoundsException e)
	         {
	            System.out.println ("Index " + i + " ist zu gross!");
	         }
	      }
	   }
}
