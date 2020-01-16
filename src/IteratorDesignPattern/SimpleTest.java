package IteratorDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		IIterator myIterator = new ConcreteIterable().createIterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
	}
}
