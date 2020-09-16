package invoker;

import commands.Command;

public class RemoteControl {
	// There are two commands, to turn the light on and off
	
	Command[] onCommands; 
	Command[] offCommands;
	
	public RemoteControl(int size) {
		onCommands = new Command[size];
		offCommands = new Command[size];
		for(int i=0; i<size; i++) {
			onCommands[i] = ()->{}; //  null object or you can create null class that execute nothing
			offCommands[i] = ()->{};
		}
	}
	
	public void setCommand(int slot, Command on, Command off) {
		onCommands[slot] = on;
		offCommands[slot] = off;
	}
	
	public void pressOnButton(int slot) {
		onCommands[slot].execute();
	}
	
	public void pressOffButton(int slot) {
		offCommands[slot].execute();
	}
	
	
	
	

}
