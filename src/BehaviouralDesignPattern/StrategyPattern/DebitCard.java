package BehaviouralDesignPattern.StrategyPattern;

public class DebitCard implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment done via Debit Card");
    }
}
