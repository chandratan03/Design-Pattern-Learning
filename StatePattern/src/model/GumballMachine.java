package model;

import states.HasQuarterState;
import states.NoQuarterState;
import states.SoldState;
import states.State;

public class GumballMachine {
	private State hasQuarter;
	private State noQuarter;
	private State soldState;
	
	private State state;
	public GumballMachine() {
		hasQuarter = new HasQuarterState(this);
		noQuarter = new NoQuarterState(this);
		soldState = new SoldState(this);
		state = noQuarter;	
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void turnCrack() {
		state.turnCrack();
		state.dispense();
	}
	public void setState(State state) {
		this.state = state;
	}
	
	public State getHasQuarter() {
		return hasQuarter;
	}
	public State getNoQuarter() {
		return noQuarter;
	}
	public State getSoldState() {
		return soldState;
	}
	public State getState() {
		return state;
	}

	
}
