package condiments;

import abstracts.Beverage;
import abstracts.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator{

	public SteamedMilk(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public String getDescription() {
		return getBeverage().getDescription()+", SteamedMilk";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost()+ 0.1;
	}

}
