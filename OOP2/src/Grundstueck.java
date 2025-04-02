/**
 * Diese Klasse stellt Methoden zur Grundstücksberechnung zur Verfügung.
 * @author oliver
 *
 */
public class Grundstueck { 

	/**
	 *  Größe des Grundstücks in Quadratmetern
	 */
	int quadratMeter; 

	/**
	 *  Berechnet den Grundstückspreis in Duisburg-Marxloh.
	 * @param quadratMeterPreis Quadratmeterpreis Du-Marxloh
	 * @return Grundstückspeis
	 */
	public int getGesamtPreis(int quadratMeterPreis){ 

		return quadratMeter * quadratMeterPreis; 

	} 
} 