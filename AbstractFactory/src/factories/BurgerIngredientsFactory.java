package factories;

import models.Cheese;
import models.Sauce;

public interface BurgerIngredientsFactory {

	public abstract Sauce createSauce();
	public abstract Cheese createCheese();
	
	
}
