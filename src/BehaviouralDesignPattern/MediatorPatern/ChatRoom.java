package BehaviouralDesignPattern.MediatorPatern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }
    @Override
    public void sendMessage(String message, User sender) {
        for(User u:users){
            if(!u.equals(sender)){
                u.recieveMessage(message, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
