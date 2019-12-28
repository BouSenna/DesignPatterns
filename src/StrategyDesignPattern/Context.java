package StrategyDesignPattern;

public class Context {
	IStrategy mStrategy;

	public Context() {
	}

	public void execute() {
		this.mStrategy.performAlgorithm();
	}

	public void setStrategy(IStrategy strategy) {
		this.mStrategy = strategy;
	}
}
