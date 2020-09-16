package models;

public class Light{
	public boolean state; // false == off, true == on
	public Light() {
		state = false;
	}
	


	public void on() {
		state = true;
		
		// Do other stuff ...
	}
	

	public void off() {
		state = false;
		
		// Do other stuff ... 
	}
	
}
