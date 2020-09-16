package beverages;

import abstracts.Beverage;

public class Espresso extends Beverage{

	public Espresso() {
		setDescription("Espresso");
	}
	@Override
	public double getCost() {
		return 1.99;
	}

}
