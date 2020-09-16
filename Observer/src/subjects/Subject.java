package subjects;

import observers.Observer;

public interface Subject {
	void registerObserver(Observer observer);
	void notifyObservers();
	void removeObserver(Observer observer);

}
