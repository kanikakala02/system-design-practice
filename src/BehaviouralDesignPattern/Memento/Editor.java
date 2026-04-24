package BehaviouralDesignPattern.Memento;

public class Editor {
    String content;

    public void setContent(String content) {
        this.content = content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.getContent();
    }

    public String getContent() {
        return content;
    }
}
