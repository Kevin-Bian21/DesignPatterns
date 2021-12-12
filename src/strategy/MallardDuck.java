package strategy;

import strategy.fly.FlyBehavior;
import strategy.fly.FlyWithWings;
import strategy.quack.Quack;
import strategy.quack.QuackBehavior;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 19:44
 **/
public class MallardDuck extends Duck {

    public MallardDuck(){}


    public MallardDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭");
    }
}
