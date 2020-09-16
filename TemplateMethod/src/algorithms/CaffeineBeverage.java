package algorithms;
// Template methods is a pattern that defines skeleton of an algorithm in a method,
// but deferring some steps to subclasses (there are some abstract methods)

public abstract class CaffeineBeverage {

	
	
	public final void prepareBeverage() {
		
		boil();// concrete method
		
		brew();//abstract method
		
		pourInCup(); // concrete method
		
		// hook could be any where part of the algorithm, could be at the first or anywhere you like
		if(customerWantsCondiment()) {  // hook
			addCondiments(); // abstract method
		}
	}

	public void boil() {
		System.out.println("Boiling Water");
	}
	
	// abstract method
	public abstract void brew();
	
	public void pourInCup() {
		System.out.println("Pouring water into cup");
	}
	
	// this is a hook, is an optional the subclass wants to override or not
	public boolean customerWantsCondiment() {
		return true;
	}

	// abstract method
	public abstract void addCondiments();
}
