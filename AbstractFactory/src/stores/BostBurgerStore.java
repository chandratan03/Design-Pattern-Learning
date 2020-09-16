package stores;

import factories.BostBurgerIngredientFactory;
import factories.BurgerIngredientsFactory;
import models.BostSpicyBurger;
import models.Burger;

public class BostBurgerStore extends BurgerStore{

	@Override
	protected Burger createBurger(String type) {
		BurgerIngredientsFactory factory = new BostBurgerIngredientFactory();
		
		Burger burger = null;
		if(type.equals("spicy")) {
			burger = new BostSpicyBurger(factory);
		}
		
		
		return burger;
	}

	
	
}
