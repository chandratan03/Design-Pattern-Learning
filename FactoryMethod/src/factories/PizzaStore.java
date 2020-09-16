package factories;

import model.Pizza;

public abstract class PizzaStore {
	
	public void orderPizza(String type) {
		
		Pizza pizza= createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println(pizza.getName()+" is ready");
	}
	
	// set to protected for only subclass and same package
	protected abstract Pizza createPizza(String type);
	
}
