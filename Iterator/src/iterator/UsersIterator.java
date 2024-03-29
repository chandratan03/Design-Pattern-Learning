package iterator;

import java.util.ArrayList;

public class UsersIterator implements Iterator{
	private ArrayList<String> names;
	private Integer position;
	public UsersIterator(ArrayList<String> names) {
		this.names = names;
		position = -1;
	}
	
	@Override
	public boolean hasNext() {
		if(names.size()-1 == position) {
			return false;
		}
		return true;
	}
	@Override
	public Object next() {
		if(hasNext()) {
			position++;
			return names.get(position);
		}
		return null;
	}

	

}
