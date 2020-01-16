package CompositeDesignPattern;

public interface IComponent {
	void operation();
	void addComponent(IComponent comp);
	void removeComponent(IComponent comp);
}
