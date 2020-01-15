package DecoratorDesignPattern;

public class DecoratorB extends Decorator {

	DecoratorB(IComponent component) {
		super(component);
	}

	public void method() {
		this.mComponent.method();
		System.out.println("Decoration B.");
	}

}
