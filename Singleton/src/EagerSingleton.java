
// this to make sure, only one object is create, when the class is loaded

public class EagerSingleton {
	
	private static EagerSingleton singleton = new EagerSingleton();
	
	private EagerSingleton() {
		// TODO Auto-generated constructor stub
	}
	public static EagerSingleton getInstance() {
		return singleton;
	}
}
