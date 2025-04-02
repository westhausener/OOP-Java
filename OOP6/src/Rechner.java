// Aufgabe 06.07
// Datei: Rechner.java

public class Rechner
{
   public static void main (String[] args)
   {
      if (args.length != 3)
      {
         System.out.println ("Unzureichende Argumente");
      } 
      
      else
      {
            int operand1 = Integer.parseInt (args[0]);
            String operation = args[1];
            int operand2 = Integer.parseInt (args[2]);

            float ergebnis = 0;

            switch(operation){
            case "add" : ergebnis = operand1 + operand2;
            break;
            case "mul" : ergebnis = operand1 * operand2;
            break;
            case "sub" : ergebnis = operand1 - operand2;
            break;
            case "div" : ergebnis = (float) operand1 / (float) operand2;
            }

            System.out.println(operand1 + " " + operation + " " + operand2 + " ist " + ergebnis);
         }                   
   }
}