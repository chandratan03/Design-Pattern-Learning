package states;

import model.GumballMachine;

public class SoldState implements State{
	GumballMachine machine;
	public SoldState(GumballMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Cant insert quarter anymore");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("Eject Quarter");
		machine.setState(machine.getNoQuarter());
	}

	@Override
	public void turnCrack() {
		System.out.println("no you cant turn anymore");
	}

	@Override
	public void dispense() {
		System.out.println("Giving you a gumball");
		System.out.println("Thank you");
		machine.setState(machine.getNoQuarter());
	}

}
