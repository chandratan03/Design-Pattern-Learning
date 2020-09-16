package condiments;

import abstracts.Beverage;
import abstracts.CondimentDecorator;

public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public String getDescription() {
		return getBeverage().getDescription()+", Soy";
	}

	@Override
	public double getCost() {
		return  getBeverage().getCost()+0.15;
	}

}
