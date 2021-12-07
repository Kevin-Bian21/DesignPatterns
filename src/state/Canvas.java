package state;

/**
 * @author BianWenKai
 * @DATE 2021/12/7 - 10:38
 **/
public class Canvas {

    private  Tool currentTool;

    public void mouseDown() {
        currentTool.mouseDown();
    }

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

}
