package IteratorDesignPattern;

import java.util.ArrayList;

public class ConcreteIterator implements IIterator {
	/// This is ConcreteIterator class for the class ConcreteIterable.

	ArrayList mArray;
	int mIndex;

	ConcreteIterator(ArrayList Array) {
		this.mArray = Array;
		this.mIndex = 0;
	}

	@Override
	public boolean hasNext() {
		if (this.mIndex >= this.mArray.size() || this.mArray.get(this.mIndex) == null)
			return false;
		return true;
	}

	@Override
	public Object next() {
		Object temp = this.mArray.get(this.mIndex);
		this.mIndex++;
		return temp;
	}

	@Override
	public void remove(int index) {
		this.mArray.remove(index);
	}

}
