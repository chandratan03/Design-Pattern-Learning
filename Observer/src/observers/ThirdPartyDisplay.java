package observers;

import subjects.Subject;

public class ThirdPartyDisplay implements DisplayElement, Observer{
	private Subject weatherData;
	
	private Float temperature;
	private Float humuidity;
	private Float pressure;
	
	public ThirdPartyDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(Float temperature, Float humidity, Float pressure) {
		this.temperature = temperature;
		this.humuidity = humidity;
		this.pressure=  pressure;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current Third party is displaying: ");
		System.out.println("current temperature :"+ temperature);
		System.out.println("current humidity: "+humuidity);
		System.out.println("current pressure: "+pressure);
		
	}
	
}
