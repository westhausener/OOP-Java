package de.nerdwest.firmaY;

import java.util.Calendar;

import de.nerdwest.firmaX.Wetterstation;

public class WetterstationDummy implements Wetterstation{

	@Override
	public double getGradCelsius() {
		return 23.6;
	}

	@Override
	public int getLuftdruck() {
		return 1000;
	}

	@Override
	public void setDatumUndZeit(Calendar c) {
		System.out.println("Setze Datum und Uhrzeit.");
		
	}


}
