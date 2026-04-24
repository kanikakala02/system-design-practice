package BehaviouralDesignPattern.Memento;

public class EditorMain {
    public static void main(String[] args) {
        Editor editor = new Editor();
        CareTaker careTaker = new CareTaker();
        editor.setContent("Demo text 1");
        careTaker.save(editor);

        editor.setContent("Demo text 2");
        careTaker.save(editor);

        careTaker.restore(editor);
        System.out.println(editor.getContent());
    }
}
