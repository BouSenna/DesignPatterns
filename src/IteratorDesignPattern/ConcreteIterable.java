package IteratorDesignPattern;

import java.util.ArrayList;

public class ConcreteIterable implements IIterable {
	ArrayList mArray;

	ConcreteIterable() {
		this.mArray = new ArrayList();
		
		for (int i = 1; i <= 5; i++)
			this.mArray.add(i);
	}

	@Override
	public IIterator createIterator() {
		return new ConcreteIterator(this.mArray);
	}

}
