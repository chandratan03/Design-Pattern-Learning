package creator;

import factories.PizzaFactory;
import model.Pizza;

public class PizzaStore {
	
	private PizzaFactory factory;
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	
	
	public void orderPizza(String type) {
		
		Pizza pizza= factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		System.out.println(pizza.getName()+" is ready");
	}
	
	// set to protected for only subclass and same package

	
}
