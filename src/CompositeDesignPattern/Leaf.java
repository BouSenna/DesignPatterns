package CompositeDesignPattern;

public class Leaf implements IComponent {
	String mName;

	public Leaf(String name) {
		this.mName = name;
	}

	@Override
	public void operation() {
		System.out.println(this.mName);
	}

	/// Overriding the other methods to do nothing,
	/// this violates the interface segregation principle.
	@Override
	public void addComponent(IComponent comp) {
		// DO NOTHING
	}

	@Override
	public void removeComponent(IComponent comp) {
		// DO NOTHING
	}
}
