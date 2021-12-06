package strategy.quack;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 20:18
 **/
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
