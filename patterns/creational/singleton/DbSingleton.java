public class DbSingleton {
	
	//This is Eager loading- It consumes innecessary resources
	//private static volatile DbSingleton instance = new DbSingleton();

    //Implementing Lazy loading
    //volatile: Makes the instance ThreadSafe
	private static volatile DbSingleton instance = null;

	private DbSingleton(){
		//Avoid Reflection
		if(instance != null){
			throw new RuntimeException("Use getInstance() method to create");
		}
	}

	
	//If we synchronize the complete method will sllow the class, every time we invoke the getInstance() method, instead we synchronize only the part regarding to new intance creation

	public static DbSingleton getInstance(){
		//Lazy Loading, load the resource only when is required
		if(instance == null){

			synchronized(DbSingleton.class){
			//Another validation in synchronized method to avoid race condition
			//It seems a hevy validation, but only will run once, on instance creation, NOT every time getInstance() is invoked
				if(instance == null){
					instance = new DbSingleton();
				}
			}
		}
		return instance;
	}

}