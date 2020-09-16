package main;

import abstracts.Beverage;
import beverages.DarkRoast;
import condiments.Mocha;
import condiments.SteamedMilk;

public class Main {

	public Main() {
		Beverage beverage =  new DarkRoast();
		
		beverage = new Mocha(beverage);
		beverage = new SteamedMilk(beverage);
		
		System.out.println(beverage.getDescription());
		System.out.println(beverage.getCost());
	}
	public static void main(String[] args) {
		new Main();
	}
}
