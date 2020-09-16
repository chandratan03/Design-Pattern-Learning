
public class DoubleLockSingleton {
	private volatile static DoubleLockSingleton  singleton;
	// (In Multithread) volatile keyword, 
	// is to ensures multiple thread handle the variable correctly, when the singleton is being 
	// initialized
	
	/*
	 * Volatile explanation
	 * Volatile to make the value of the variable or object will not be cache,
	 * so if we access value of the variable, it always access or read from the main memory
	 * 
	 * https://www.javatpoint.com/volatile-keyword-in-java#:~:text=Volatile%20keyword%20is%20used%20to,same%20time%20without%20any%20problem.
	 * */
	
	private DoubleLockSingleton () {
	}
	
	
	public static DoubleLockSingleton  getInstance() {
		if(singleton == null) { 
			// if the singleton is not created, then he create the object with synchronized
			synchronized(DoubleLockSingleton.class){
				if(singleton == null)
					singleton = new DoubleLockSingleton();
			}
		}
		return singleton;
	}
}
