package strategy.quack;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 20:18
 **/
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
