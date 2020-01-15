package DecoratorDesignPattern;

public class DecoratorA extends Decorator {

	DecoratorA(IComponent component) {
		super(component);
	}

	public void method() {
		this.mComponent.method();
		System.out.println("Decoration A.");
	}

}
