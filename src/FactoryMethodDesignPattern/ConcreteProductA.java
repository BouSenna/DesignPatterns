package FactoryMethodDesignPattern;

public class ConcreteProductA implements IProduct {
	// Product of type A
	@Override 
	public void method() {
		System.out.println("ConcreteProductA instance created.");
	}
}

