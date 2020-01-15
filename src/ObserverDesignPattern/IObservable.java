package ObserverDesignPattern;

public interface IObservable {
	void registerObserver(IObserver newObserver);
	void removeObserver(IObserver newObserver);
	void notifyObservers();
}
