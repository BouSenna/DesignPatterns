package StrategyDesignPattern;

public class SimpleTest {
	public static void main(String[] args) {
		Context context = new ClientA();
		context.execute();

		context.setStrategy(new ConcreteStrategyB());
		context.execute();
	}
}
