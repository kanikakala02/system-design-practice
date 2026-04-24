package OOPS;

public abstract class Card implements PaymentMethod {
    protected String cardNo;
    protected String userName;

    public Card(String cardNo, String userName) {
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public String getUserName() {
        return userName;
    }

    public abstract void pay();
}
