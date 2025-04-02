// Datei: GeometrischeFigur.java

public abstract class GeometrischeFigur
{
   protected abstract double berechneFlaeche();
   protected abstract double berechneUmfang();

   public void print()
   {
      System.out.println ("Die Flaeche betraegt: " + berechneFlaeche());
      System.out.println ("Der Umfang betraegt: " + berechneUmfang());
      System.out.println();
   }
}