package memento;

import java.util.Stack;

/**
 * @author BianWenKai
 * @DATE 2021/12/6 - 16:02
 **/
public class History {

    private Stack<EditorState> stack = new Stack<>();

    public void push(EditorState state) {
        stack.push(state);
    }

    public EditorState pop() {
        if (!stack.isEmpty())
            return stack.pop();
        return null;
    }

}
