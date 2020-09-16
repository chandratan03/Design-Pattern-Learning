package stores;

import models.Burger;

public abstract class BurgerStore {

	public void orderPizza(String type) {
		Burger burger = createBurger(type);
		burger.prepare();
		System.out.println("Your "+burger.getName()+" already done");
		
	}
	
	protected abstract Burger createBurger(String type);
	
	
	
}
