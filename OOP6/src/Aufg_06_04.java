
public class Aufg_06_04 {

	private int wert = 7;
	
	public int zugriff(){
		int wert = 77;
		//return wert;
		return this.wert;
	}
	
	public static void main(String[] args){
		Aufg_06_04 me = new Aufg_06_04();
		System.out.println(me.zugriff());
	}
	
}
