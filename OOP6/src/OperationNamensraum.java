// Datei: PolymorpheOperation.java

public class OperationNamensraum
{
   public static void main (String [] args)
   {
      Quadrat quad = new Quadrat();
      quad.setSeitenlaenge(5);
      Kreis kreis = new Kreis();
      kreis.setRadius(5);

      //Flaecheninhalt des Quadrats
      System.out.println ("Flaecheninhalt des Quadrats: " + quad.berechneFlaecheninhalt());

      //Flaecheninhalt des Kreises
      System.out.println ("Flaecheninhalt des Kreises: " + kreis.berechneFlaecheninhalt());
   }
}

class Quadrat
{
   private double seitenlaenge;

   public void setSeitenlaenge (double seitenlaenge)
   {
      this.seitenlaenge = seitenlaenge;
   }

   public double berechneFlaecheninhalt(){
	   return seitenlaenge*seitenlaenge;
   }
}

class Kreis
{
   private double radius;

   public void setRadius (double radius)
   {
      this.radius = radius;
   }
   
   public double berechneFlaecheninhalt(){
	   return Math.PI*radius*radius;
   }

}