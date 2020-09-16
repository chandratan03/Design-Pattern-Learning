package main;

import commands.ACOffCommand;
import commands.ACOnCommand;
import commands.Command;
import commands.LightOffCommand;
import commands.LightOnCommand;
import invoker.RemoteControl;
import models.AC;
import models.Light;

public class Main {
	// For this example, assume that the remote control could turn the light off and on
	// and turn the ac on and off
	
	public Main() {
		RemoteControl rc = new RemoteControl(2);
		
		Light light = new Light();
		AC ac = new AC();
		
		Command lightOn = new LightOnCommand(light);
		Command lightOff = new LightOffCommand(light);
		Command acOn = new ACOnCommand(ac);
		Command acOff = new ACOffCommand(ac);
		
		
		
		rc.setCommand(0, lightOn, lightOff);
		rc.setCommand(1, lightOn, lightOff);
		
		
		rc.pressOffButton(0);
		System.out.println(light.state);
		rc.pressOnButton(0);
		System.out.println(light.state);
	}

	public static void main(String[] args) {
		new Main();
	}

}
