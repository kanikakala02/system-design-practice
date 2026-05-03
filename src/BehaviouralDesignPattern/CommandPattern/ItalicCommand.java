package BehaviouralDesignPattern.CommandPattern;

public class ItalicCommand implements Command{
    TextEditor editor;
    public ItalicCommand(TextEditor editor) {
        this.editor = editor;
    }
    @Override
    public void execute() {
        editor.italictext();
    }
}
