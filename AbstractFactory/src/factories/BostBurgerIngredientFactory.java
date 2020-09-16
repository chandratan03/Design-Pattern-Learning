package factories;

import models.Cheese;
import models.HotSauce;
import models.IndonesiaCheese;
import models.Sauce;

// Bost Burger is the shop/restaurant name

public class BostBurgerIngredientFactory implements BurgerIngredientsFactory{

	@Override
	public Sauce createSauce() {
		return new HotSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new IndonesiaCheese();
	}

}
