package main;

import factories.BeefDumplingStore;
import factories.ChickenDumplingStore;
import factories.DumplingStore;
import models.Dumpling;

public class Main {

	public Main() {
		DumplingStore beefStore = new BeefDumplingStore();
		Dumpling beef = beefStore.orderDumpling();
		
		System.out.println("");
		DumplingStore chickenStore = new ChickenDumplingStore();
		Dumpling chicken = chickenStore.orderDumpling();
		
	}
	public static void main(String[] args) {
		new Main();
	}
}
