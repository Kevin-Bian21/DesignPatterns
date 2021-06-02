import fly.FlyBehavior;
import fly.FlyWithWings;
import quack.Quack;
import quack.QuackBehavior;

/**
 * @author BianWenKai
 * @Data 2021/6/2 - 19:44
 **/
public class MallardDuck extends Duck {

    public MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    public MallardDuck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("我是一只绿头鸭");
    }
}
