package models;

import factories.BurgerIngredientsFactory;

public abstract class Burger {
	Cheese cheese;
	Sauce sauce;
	protected String name;
	
	BurgerIngredientsFactory factory;

	public Burger(BurgerIngredientsFactory factory) {
		this.factory = factory;
	}
	
	public abstract void prepare();
	
	
	void cook() {
		System.out.println("Cooking the "+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	
	
	
	
}
