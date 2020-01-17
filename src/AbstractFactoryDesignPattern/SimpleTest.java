package AbstractFactoryDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		IFactory productFamily1 = new ConcreteFactory1();
		productFamily1.createProductA().method();
		productFamily1.createProductB().method();
		
		IFactory productFamily2 = new ConcreteFactory2();
		productFamily2.createProductA().method();
		productFamily2.createProductB().method();
	}
}
