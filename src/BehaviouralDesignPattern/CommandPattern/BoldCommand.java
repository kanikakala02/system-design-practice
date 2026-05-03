package BehaviouralDesignPattern.CommandPattern;

public class BoldCommand implements Command {
    TextEditor editor;

    public BoldCommand(TextEditor editor) {
        this.editor = editor;
    }
    @Override
    public void execute(){
        editor.boldtext();
    }
}
