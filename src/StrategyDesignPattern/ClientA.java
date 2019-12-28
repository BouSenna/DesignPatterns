package StrategyDesignPattern;

public class ClientA extends Context {
    public ClientA(){
        this.mStrategy = new ConcreteStrategyA();
    }
}
