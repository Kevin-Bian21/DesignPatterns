package state;

/**
 * @author BianWenKai
 * @DATE 2021/12/7 - 10:34
 **/
//ps:擦除工具
public class EraseTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("erase icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("some thing had been erased");
    }
}
