package main;

import model.GumballMachine;

public class Main {

	public Main() {
		GumballMachine machine =new GumballMachine();
		machine.insertQuarter();
		machine.turnCrack();
	}
	public static void main(String[] args) {
		new Main();
	}

}
