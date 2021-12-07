package state;

/**
 * @author BianWenKai
 * @DATE 2021/12/7 - 10:33
 **/
//ps:画刷工具
public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Brush draw");
    }
}
