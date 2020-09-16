package beverages;

import abstracts.Beverage;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		setDescription("DarkRoast");
	}
	@Override
	public double getCost() {
		return .99;
	}

}
