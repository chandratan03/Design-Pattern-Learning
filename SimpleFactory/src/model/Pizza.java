package model;

public abstract class Pizza {
	// attributes"
	// whatever attributes are
	
	private String name;
	
	// method
	public void prepare() {
		System.out.println("Preparing pizza");
	};
	
	public void bake() {
		System.out.println("Baking pizza");
	}
	public void cut() {
		System.out.println("Cutting pizza");
	}
	public void box() {
		System.out.println("Place the pizza into a box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
