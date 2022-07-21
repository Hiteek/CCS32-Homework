package Command;

import java.util.*;
public class Application {

    Stack<Editor> editors = new Stack<>();
    Editor activeEditor;
    String clipboard;
    CommandHistory history;

    public void createUI(){
    }
    public void executeCommand(Command c){
        if(c.execute()){
            history.push(c);
        }
    }
    public void undo(){
        Command command = history.pop();
        if (command != null){
            command.undo();
        }
    }
}
