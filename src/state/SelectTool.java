package state;

/**
 * @author BianWenKai
 * @DATE 2021/12/7 - 10:30
 **/

//ps:选择工具
public class SelectTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("select icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("some regions have been select");
    }
}
