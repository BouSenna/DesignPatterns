package FactoryMethodDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		IFactory productA = new ConcreteFactory();
		productA.createProduct("TypeA").method();
		productA.createProduct("TypeB").method();
	}
}
