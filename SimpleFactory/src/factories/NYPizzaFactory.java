package factories;

import model.NYCheesePizza;
import model.Pizza;

public class NYPizzaFactory implements PizzaFactory{

	@Override
	public Pizza createPizza(String type) {
		return new NYCheesePizza();
	}

}
