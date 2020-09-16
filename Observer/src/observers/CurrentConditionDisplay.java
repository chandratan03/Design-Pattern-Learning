package observers;

import subjects.Subject;

public class CurrentConditionDisplay implements DisplayElement, Observer{
	private Subject weatherData;
	
	private Float temperature;
	private Float humuidity;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(Float temperature, Float humidity, Float pressure) {
		this.temperature = temperature;
		this.humuidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current Condition: ");
		System.out.println("current temperature :"+ temperature);
		System.out.println("current humidity: "+humuidity);
	}
}
