package ObserverDesignPattern;

import java.util.ArrayList;

public class ConcreteObservable implements IObservable {
	ArrayList<IObserver> mObservers;

	public ConcreteObservable() {
		mObservers = new ArrayList<IObserver>();
	}

	@Override
	public void registerObserver(IObserver newObserver) {
		this.mObservers.add(newObserver);
	}

	@Override
	public void removeObserver(IObserver newObserver) {
		this.mObservers.remove(newObserver);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < this.mObservers.size(); i++)
			this.mObservers.get(i).update();
	}
}
