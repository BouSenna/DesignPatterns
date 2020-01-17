package AdapterDesignPattern;

public class Adapter implements ITarget {
	Adaptee mAdaptee;
	public Adapter(Adaptee adaptee) {
		this.mAdaptee = adaptee;
	}
	@Override
	public void request() {
		this.mAdaptee.modifiedRequest();
	}

}
