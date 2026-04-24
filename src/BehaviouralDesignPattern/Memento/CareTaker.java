package BehaviouralDesignPattern.Memento;

import java.util.Stack;

public class CareTaker {
    private Stack<EditorMemento> history= new Stack<>();

    public void save(Editor editor){
        history.push(editor.save());
    }

    public void restore(Editor editor){
        if(!history.empty()){
            history.pop();
            editor.restore(history.peek());
        }
    }

}
