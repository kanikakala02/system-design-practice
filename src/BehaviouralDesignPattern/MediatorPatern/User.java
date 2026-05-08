package BehaviouralDesignPattern.MediatorPatern;

public class User {
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator) {
        this.name=name;
        this.chatMediator=chatMediator;
    }

    public void sendMessage(String message) {
        System.out.println("Sending messing from "+this.name+" "+ message);
        chatMediator.sendMessage(message, this);
    }

    public void addUser(User user) {
        chatMediator.addUser(user);
    }

    public void recieveMessage(String message, User sender) {
        System.out.println(this.name+" recieved message from "+ sender.name +" "+ message);
    }
}
