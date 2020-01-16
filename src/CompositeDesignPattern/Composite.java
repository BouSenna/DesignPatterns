package CompositeDesignPattern;

import java.util.ArrayList;

public class Composite implements IComponent {
	ArrayList<IComponent> mArray;
	String mName;
	
	public Composite(String name) {
		this.mArray = new ArrayList<IComponent>();
		this.mName = name;
	}

	@Override
	public void operation() {
		System.out.println(this.mName);
		for (IComponent comp : this.mArray)
			comp.operation();
	}

	@Override
	public void addComponent(IComponent component) {
		this.mArray.add(component);
	}

	@Override
	public void removeComponent(IComponent component) {
		this.mArray.remove(component);
	}
}
