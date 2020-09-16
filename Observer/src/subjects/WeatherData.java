package subjects;

import java.util.ArrayList;

import observers.Observer;

public class WeatherData implements Subject{
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private Float temperature, humidity, pressure;
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for(int i=0; i<observers.size(); i++) {
			observers.get(i).update(temperature, humidity, pressure);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		Integer index = observers.indexOf(observer);
		if(index >=0)
			observers.remove(index);
	}
	
	public void setMeasurements(Float temperature, Float humidity, Float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		notifyObservers(); // notify all
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
		notifyObservers();
	}

	public Float getPressure() {
		return pressure;
	}

	public void setPressure(Float pressure) {
		this.pressure = pressure;
		notifyObservers();
	}

	
	
}
