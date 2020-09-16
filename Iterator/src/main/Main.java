package main;

import java.util.ArrayList;

import iterator.Iterator;
import model.ListMenu;
import model.UserList;

public class Main {

	public Main() {
		ListMenu list = new UserList();
		
		// for the type safe in  iterator , you can use generic class
		Iterator myIterator = list.getIterator();
		
		printAll(myIterator);
	}
	
	public void printAll(Iterator iterator) {
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public static void main(String[] args) {
		new Main();
	}
}
