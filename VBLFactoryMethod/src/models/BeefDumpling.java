package models;

public class BeefDumpling extends Dumpling{

	public BeefDumpling(String materials, String name, Integer price) {
		super(materials, name, price);
	}

	@Override
	public void makeDumpling() {
		System.out.println("Steaming the beef");
		System.out.println("Wrapped into dumpling");
		System.out.println("beef dumpling is ready");
	}

}