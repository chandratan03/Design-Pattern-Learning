package models;

import factories.BurgerIngredientsFactory;

public class DunCheeseSpicyBurger extends Burger{

	public DunCheeseSpicyBurger(BurgerIngredientsFactory factory) {
		super(factory);
		name = "Dun Cheese Spicy Burger";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing "+name);
		cheese = factory.createCheese();
		sauce = factory.createSauce();
		System.out.println("Cheese name is "+ cheese.getName());

		System.out.println("Sauce name is "+ sauce.getName());
	}

}
