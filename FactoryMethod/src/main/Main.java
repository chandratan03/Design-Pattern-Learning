package main;

import factories.NYPizzaStore;
import factories.PizzaStore;

public class Main {

	public Main() {
		PizzaStore pizzaStore = new NYPizzaStore();
		pizzaStore.orderPizza("NYPizza");
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
