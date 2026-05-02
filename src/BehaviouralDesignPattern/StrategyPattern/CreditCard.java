package BehaviouralDesignPattern.StrategyPattern;

public class CreditCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment done via Credit Card");
    }
}
