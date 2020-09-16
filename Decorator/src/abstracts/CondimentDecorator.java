package abstracts;

public abstract class CondimentDecorator extends Beverage{
	private Beverage beverage; // wrapper
	
	public abstract String getDescription();
	
	public Beverage getBeverage() {
		return beverage;
	}
	public void setBeverage(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
