package commands;

import models.AC;

public class ACOffCommand implements Command{
	AC ac;
	
	

	public ACOffCommand(AC ac) {
		this.ac = ac;
	}



	@Override
	public void execute() {
		ac.off();
		
		// do other stuff ...
	}

}
