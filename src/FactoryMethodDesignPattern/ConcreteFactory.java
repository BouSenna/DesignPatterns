package FactoryMethodDesignPattern;

public class ConcreteFactory implements IFactory {

	@Override
	public IProduct createProduct(String Type) {
		switch (Type) {
		case "TypeA":
			return new ConcreteProductA();
		case "TypeB":
			return new ConcreteProductB();
		default:
			return null;
		}
	}

}
