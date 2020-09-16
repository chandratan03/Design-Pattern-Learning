package stores;

import factories.BurgerIngredientsFactory;
import factories.DunBurgerIngredientsFactory;
import models.Burger;
import models.DunCheeseSpicyBurger;
import models.DunSuperHotBurger;

public class DunBurgerStore extends BurgerStore{

	@Override
	protected Burger createBurger(String type) {
		Burger burger  = null;
		
		// just think the option always one of these
		
		BurgerIngredientsFactory factory = new DunBurgerIngredientsFactory();
		
		if(type.equals("hot")) {
			burger = new DunSuperHotBurger(factory);
		}else if(type.equals("cheese-spicy")) {
			burger = new DunCheeseSpicyBurger(factory);
		}
		return burger;
	}

}
