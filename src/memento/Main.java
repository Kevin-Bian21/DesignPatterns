package memento;

/**
 * @author BianWenKai
 * @DATE 2021/12/6 - 13:51
 **/
public class Main {

    public static void main(String[] args) {
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");

        editor.undo(history.pop());
        editor.undo(history.pop());
        System.out.println(editor.getContent());
    }


}
