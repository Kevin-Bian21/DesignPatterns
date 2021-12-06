package memento;

/**
 * @author BianWenKai
 * @DATE 2021/12/6 - 13:50
 **/
public class Editor {

    private  String content;

    public EditorState createState() {
        return new EditorState(content);
    }

    public void undo(EditorState state) {
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
