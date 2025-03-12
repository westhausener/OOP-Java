class DBHandler{
   private static DBHandler me; 

   private DBHandler(){
      System.out.println ("Bin im Konstruktor");    
   } 
   
   public static DBHandler getDBHandler(){
      if (me == null)
	  {
         me = new DBHandler();
      }       
	  return me;
   } 
} 


public class SingletonTest {

	public static void main(String[] args) {
		
		//DBHandler dbh = new DBHandler();
		DBHandler dbh1 = DBHandler.getDBHandler();
		DBHandler dbh2 = DBHandler.getDBHandler();
		
	}

}
