package StrategyDesignPattern;

public class ClientB extends Context {
    public ClientB(){
        this.mStrategy = new ConcreteStrategyB();
    }
}
