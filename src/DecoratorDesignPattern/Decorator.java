package DecoratorDesignPattern;

public abstract class Decorator implements IComponent {
	IComponent mComponent;

	public Decorator(IComponent component) {
		this.mComponent = component;

	}
}
