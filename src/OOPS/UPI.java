package OOPS;

public class UPI implements PaymentMethod {
    String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public void pay() {
        System.out.println("Payment Via UPI" + upiId);
    }

}
