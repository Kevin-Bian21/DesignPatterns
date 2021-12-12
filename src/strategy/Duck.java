package strategy;

import strategy.fly.FlyBehavior;
import strategy.quack.QuackBehavior;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 19:35
 **/
public abstract class Duck {

    FlyBehavior flyBehavior;  //为行为接口类型声明两个引用变量，所有鸭子子类都继承它们。
    QuackBehavior quackBehavior;

    public abstract void display();

    public void swim(){
        System.out.println("我在浮水，因为所有的鸭子都会浮水");
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    //使用setter方法来设定鸭子行为，而不再具体鸭子的构造器内实例化。
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
