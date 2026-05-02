package BehaviouralDesignPattern.StrategyPattern;

public class PaymentService {
    PaymentStrategy strategy;
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
    public void pay() {
        strategy.pay();
    }
}
