package condiments;

import abstracts.Beverage;
import abstracts.CondimentDecorator;

public class Mocha extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		setBeverage(beverage);
	}
	
	@Override
	public String getDescription() {
		return getBeverage().getDescription()+", Mocha";
	}

	@Override
	public double getCost() {
		return getBeverage().getCost()+ 0.2;
	}
	
}
