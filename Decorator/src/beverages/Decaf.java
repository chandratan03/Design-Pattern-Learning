package beverages;

import abstracts.Beverage;

public class Decaf extends Beverage{
	public Decaf() {
		setDescription("Decaf");
	}
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
