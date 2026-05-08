package BehaviouralDesignPattern.MediatorPatern;

public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator chatRoom= new ChatRoom();
        User kanika= new User("Kanika",chatRoom);
        User  john= new User("John",chatRoom);
        User jane= new User("Jane",chatRoom);

        chatRoom.addUser(kanika);
        chatRoom.addUser(john);
        chatRoom.addUser(jane);

        kanika.sendMessage("Hello Everyone");
    }
}
