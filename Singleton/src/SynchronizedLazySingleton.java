


public class SynchronizedLazySingleton {
	private static SynchronizedLazySingleton  singleton;
	
	private SynchronizedLazySingleton () {
	}
	
	
	// to make sure, whenever using get instance must be synchronized
	public synchronized static SynchronizedLazySingleton  getInstance() {
		if(singleton == null) {
			singleton = new SynchronizedLazySingleton();
		}
		return singleton;
	}
	
	/*
	 * https://stackoverflow.com/questions/1671089/why-are-synchronize-expensive-in-java#:~:text=It%20is%20expensive%20because%20if,be%20executed%20at%20a%20time.&text=It%20is%20even%20expensive%20when,he%20is%20allowed%20to%20run.
	 * 
	 * */
	// remember synchronized keyword is very expensive
	// it is 50 times slower than un-synchronized method
	
	
}
