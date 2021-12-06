package strategy.fly;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 19:42
 **/
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
