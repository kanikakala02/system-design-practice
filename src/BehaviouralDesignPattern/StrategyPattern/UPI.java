package BehaviouralDesignPattern.StrategyPattern;

public class UPI implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment done via UPI");
    }
}
