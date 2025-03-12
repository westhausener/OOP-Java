package de.nerdwest.firmaY;

import java.util.Calendar;

import de.nerdwest.firmaX.Wetterstation;

public class WetterstationEcht implements Wetterstation{

	@Override
	public double getGradCelsius() {
		return 0;
	}

	@Override
	public int getLuftdruck() {
		return 0;
	}

	@Override
	public void setDatumUndZeit(Calendar c) {
		
		
	}


}
