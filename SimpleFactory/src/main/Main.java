package main;

import creator.PizzaStore;
import factories.NYPizzaFactory;
import factories.PizzaFactory;

public class Main {

	public Main() {
		
		PizzaFactory factory = new NYPizzaFactory();
		PizzaStore pizzaStore = new PizzaStore(factory);
		
		pizzaStore.orderPizza("NYPizza");
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
