package AdapterDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		ITarget myTarget = new Adapter(new Adaptee());
		myTarget.request();
	}
}
