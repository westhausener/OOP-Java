// Datei: Person.java

public class Person
{
   private String name;
   private String vorname;

   public Person(String name, String vorname){
	   this.name = name;
	   this.vorname = vorname;
   }
   
   public void setName (String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public void setVorname (String n)
   {
      vorname = n;
   }

   public String getVorname()
   {
      return vorname;
   }
}

