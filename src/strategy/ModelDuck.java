package strategy;

import strategy.fly.FlyNoWay;
import strategy.quack.MuteQuack;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 20:26
 **/
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("我是一只模型鸭");
    }
}
