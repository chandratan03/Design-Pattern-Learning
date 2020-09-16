package factories;

import models.Dumpling;


public abstract class DumplingStore{

	public DumplingStore() {
		
	}
	public Dumpling orderDumpling() {
		System.out.println("Creating dumpling");
	
		Dumpling dumpling = createDumpling();
		dumpling.makeDumpling();
		System.out.println(dumpling.getName()+" is Serving to the client");
		System.out.println("Done Serving");
		
		return dumpling;
	}
	protected abstract Dumpling createDumpling() ;

}
