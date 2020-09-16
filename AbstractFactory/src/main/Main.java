package main;

import stores.BurgerStore;
import stores.DunBurgerStore;

public class Main {
	
	// Abstract factory create families of dependent object
	
	public Main() {
		BurgerStore store = new DunBurgerStore();
		store.orderPizza("hot");
		
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
