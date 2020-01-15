package DecoratorDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		IComponent myComponent = new DecoratorA(new DecoratorB(new ConcreteComponent()));
		myComponent.method();
	}
}
