package abstracts;

public abstract class Beverage {
	private String description = "Unknown";

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public abstract double getCost();
	
}
