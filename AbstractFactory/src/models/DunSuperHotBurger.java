package models;

import factories.BurgerIngredientsFactory;

public class DunSuperHotBurger extends Burger{

	public DunSuperHotBurger(BurgerIngredientsFactory factory) {
		super(factory);
		name = "Don's Super Hot Burgerr";
	}

	@Override
	public void prepare() {
		System.out.println("Preparing: "+name);
		sauce= factory.createSauce();
		System.out.println("Sauce name is :" + sauce.getName());
	}

	
	
	
}
