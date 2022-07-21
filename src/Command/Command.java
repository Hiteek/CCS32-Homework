package Command;

import java.util.*;
public abstract class Command {
    protected Application app;
    protected Editor editor;
    protected String backup;
    Command(Application app, Editor editor){
        this.app = app;
        this.editor = editor;
    }
    public void saveBackup(){
        backup = editor.text;
    }
    public void undo(){
        editor.text = backup;
    }
    public abstract boolean execute();
}

class CopyCommand extends Command{
    CopyCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public boolean execute(){
        app.clipboard = editor.getSelection();
        return false;
    }
}

class CutCommand extends Command{
    CutCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public boolean execute(){
        saveBackup();
        app.clipboard = editor.getSelection();
        return true;
    }
}

class PasteCommand extends Command{
    PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public boolean execute() {
        saveBackup();
        editor.replaceSelection(app.clipboard);
        return true;
    }
}

class UndoCommand extends Command{
    UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }
    public boolean execute() {
        app.undo();
        return false;
    }
}

class CommandHistory{
    private Stack<Command> history = new Stack<>();
    public void push(Command c){
        history.push(c);
    }
    public Command pop(){
        return history.pop();
    }
}