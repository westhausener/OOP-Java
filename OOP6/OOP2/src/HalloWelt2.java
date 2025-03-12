/**
 * Beschreibung der Klasse
 * @author oliver
 *
 */
public class HalloWelt2 { 

	/**
	 * Beschreibung des Attributs
	 */
	int quadratMeter; 

	
	/**
	 * Berechnet den Preis eine Grundstücks in Paris
	 * @param quadratMeterPreis  Preis des GS in Euro pro qm
	 * @return Gesamtpreis
	 */
	public int getGesamtPreis(int quadratMeterPreis){ 

		return quadratMeter * quadratMeterPreis; 

	} 
} 