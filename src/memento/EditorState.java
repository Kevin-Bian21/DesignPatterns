package memento;

/**
 * @author BianWenKai
 * @DATE 2021/12/6 - 15:55
 **/
public class EditorState {

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
