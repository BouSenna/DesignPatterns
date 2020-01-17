package SingletonDesignPattern;

public class Singleton {
	static private Singleton mInstance;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (mInstance == null)
			mInstance = new Singleton();
		return mInstance;
	}
}
