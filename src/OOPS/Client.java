package OOPS;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();
        ps.addPaymentMethod("KanikaDebitCard", new DebitCard("1234", "kanika's Debit"));
        ps.addPaymentMethod("KanikaCreditCrad", new CreditCard("12345", "kanika's Credit Card"));
        ps.addPaymentMethod("kanikaUPI", new UPI("Kanika8"));
        ps.makePayment("KanikaDebitCard");
        ps.makePayment("KanikaCreditCrad");
        ps.makePayment("kanikaUPI");
    }
}
