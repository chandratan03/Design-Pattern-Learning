package factories;

import model.Pizza;

public interface PizzaFactory {
	abstract Pizza createPizza(String type);
}
