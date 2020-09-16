package models;

public class AC {
	public boolean state; // false == off, true == on
	public AC() {
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
