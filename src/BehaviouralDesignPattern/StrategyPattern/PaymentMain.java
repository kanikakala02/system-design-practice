package BehaviouralDesignPattern.StrategyPattern;

public class PaymentMain {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setStrategy(new CreditCard());
        paymentService.pay();
        paymentService.setStrategy(new DebitCard());
        paymentService.pay();
    }
}
