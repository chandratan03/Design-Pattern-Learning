package models;

public class ChickenDumpling extends Dumpling{

	public ChickenDumpling(String materials, String name, Integer price) {
		super(materials, name, price);
	}


	@Override
	public void makeDumpling() {
		System.out.println("Grilling the Chicken");
		System.out.println("Wrapped into dumpling");
		System.out.println("chicken dumpling is ready");
	}
	

}
