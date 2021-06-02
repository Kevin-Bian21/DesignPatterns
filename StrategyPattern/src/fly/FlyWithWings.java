package fly;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 19:40
 **/
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("我在用翅膀飞行");
    }
}
