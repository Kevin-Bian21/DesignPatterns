package state;

/**
 * @author BianWenKai
 * @DATE 2021/12/7 - 10:37
 **/
public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
