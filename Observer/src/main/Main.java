package main;

import observers.CurrentConditionDisplay;
import observers.ThirdPartyDisplay;
import subjects.WeatherData;

public class Main {

	public Main() {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
		ThirdPartyDisplay tpd = new ThirdPartyDisplay(weatherData);
		
		
		weatherData.setMeasurements(80.5f, 80.9f, 40.0f);
	}
	public static void main(String[] args) {
		new Main();
	}

}
