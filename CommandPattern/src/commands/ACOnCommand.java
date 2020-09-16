package commands;

import models.AC;

public class ACOnCommand implements Command{
	AC ac;
	
	
	public ACOnCommand(AC ac) {
		this.ac = ac;
	}


	@Override
	public void execute() {
		ac.on();
		
		// do other stuff ...
	}

}
