package FactoryMethodDesignPattern;

public class ConcreteProductB implements IProduct {
	// Product of type B
	@Override 
	public void method() {
		System.out.println("ConcreteProductB instance created.");
	}
}
