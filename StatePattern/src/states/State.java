package states;

public interface State {
	public abstract void insertQuarter();
	public abstract void ejectQuarter();
	public abstract void turnCrack();
	public abstract void dispense();
	
}
