package condiments;

import abstracts.Beverage;
import abstracts.CondimentDecorator;

public class Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public String getDescription() {
		return getBeverage().getDescription()+", Whip";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost()+ 0.1;
	}

}
