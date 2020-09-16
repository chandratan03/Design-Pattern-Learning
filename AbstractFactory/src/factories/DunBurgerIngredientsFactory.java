package factories;

import models.BBQSauce;
import models.Cheese;
import models.Sauce;
import models.SingaporeCheese;

public class DunBurgerIngredientsFactory implements BurgerIngredientsFactory{

	@Override
	public Sauce createSauce() {
		return new BBQSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new SingaporeCheese();
	}
	
}
