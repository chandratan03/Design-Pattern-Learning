package states;

import model.GumballMachine;

public class HasQuarterState implements State{
	GumballMachine machine;
	public HasQuarterState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Cant insert quarter");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Thank you");
		machine.setState(machine.getNoQuarter());
	}

	@Override
	public void turnCrack() {
		machine.setState(machine.getSoldState());
	}

	@Override
	public void dispense() {
		System.out.println("cant dispense");
	}

}
