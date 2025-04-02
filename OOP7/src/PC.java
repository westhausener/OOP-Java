public class PC {

	private String hersteller;
	private int arbeitsSpeicher;
	private String betriebsSystem;
	
	public PC(String hersteller, int arbeitsSpeicher, String betriebsSystem) {
		this.hersteller = hersteller;
		this.arbeitsSpeicher = arbeitsSpeicher;
		this.betriebsSystem = betriebsSystem;
	}
	
	public static void main(String[] args){

		PC meinPC = new PC("Asus", 8, "Linux Mint 19");

		System.out.println("Hersteller: "+meinPC.hersteller);
		System.out.println("Speicher: "+meinPC.arbeitsSpeicher);
		System.out.println("BS: "+meinPC.betriebsSystem);
	}

	
}