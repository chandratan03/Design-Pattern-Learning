package facade;

import components.Light;
import components.Speaker;
import components.Tv;

public class HomeFacade {
	// public because the client or user could still access the light,speaker, etc in advance
	public Light light;
	public Speaker speaker;
	public Tv tv;
	
	public HomeFacade(Light light, Speaker speaker, Tv tv) {
		this.light = light;
		this.speaker = speaker;
		this.tv = tv;
	}
	
	public void turnOnAll() {
		light.on();
		speaker.on();
		tv.on();
		// and doing etc...
	}
	
	public void turnOffAll() {
		light.off();
		speaker.off();
		tv.off();

		// and doing etc...
	}
	

}
