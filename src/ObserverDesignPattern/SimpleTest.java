package ObserverDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		IObservable mySubject = new ConcreteObservable();
		IObserver myFirstObserver = new ConcreteObserverA();
		IObserver mySecondObserver = new ConcreteObserverB();
		
		mySubject.registerObserver(myFirstObserver);
		mySubject.registerObserver(mySecondObserver);
		mySubject.notifyObservers();
		
		mySubject.removeObserver(myFirstObserver);
		mySubject.notifyObservers();
	}
}
