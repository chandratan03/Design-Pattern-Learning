package factories;

import model.NYCheesePizza;
import model.Pizza;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		// could give some conditions what pizza does the customer wants
		
		return new NYCheesePizza();
	}
	
}
