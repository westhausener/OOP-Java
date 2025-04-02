// Datei: TransaktionsException.java

public class TransaktionsException extends Exception {

   public TransaktionsException()
   {
      super ("Betrag liegt im Minus oder das Guthaben reicht nicht aus");
   }
   
   public TransaktionsException(String message)
   {
      super (message);
   }
}
