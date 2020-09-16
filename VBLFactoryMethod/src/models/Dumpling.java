package models;

public abstract class Dumpling {
	private String materials;
	private String name;
	private Integer price;
	
	
	
	public Dumpling(String materials, String name, Integer price) {
		super();
		this.materials = materials;
		this.name = name;
		this.price = price;
	}
	

	public abstract void makeDumpling();

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	} 
	
	
	
	
}
