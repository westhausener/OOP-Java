package de.nerdwest.firmaX;

import java.util.Calendar;

public interface Wetterstation {
	
	/**
	 * Holt den aktuellen Temperaturwert in Grad Celsius.
	 * @return Temperaturwert in Grad Celsius
	 */
	public double getGradCelsius();
	
	/**
	 * Holt den aktuellen Luftdruck in hPa.
	 * @return Luftdruck in hPa
	 */
	public int getLuftdruck();
	
	/**
	 * Setzt das Datum und die Uhrzeit
	 * @param c Kalenderobjekt mit Datum und Uhrzeit
	 */
	public void setDatumUndZeit(Calendar c);
	

}
