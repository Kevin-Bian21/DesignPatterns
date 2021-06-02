package quack;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 20:17
 **/
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
