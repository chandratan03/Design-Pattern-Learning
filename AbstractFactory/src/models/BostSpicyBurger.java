package models;

import factories.BurgerIngredientsFactory;

public class BostSpicyBurger extends Burger{

	public BostSpicyBurger(BurgerIngredientsFactory factory) {
		super(factory);
		name = "Bost's Spicy Burger";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		sauce= factory.createSauce();
		System.out.println("Sauce name is: "+sauce.getName());
	}
	
	
	
}
