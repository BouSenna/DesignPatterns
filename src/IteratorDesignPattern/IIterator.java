package IteratorDesignPattern;

public interface IIterator {
	boolean hasNext();
	Object next();
	void remove(int index);
}
