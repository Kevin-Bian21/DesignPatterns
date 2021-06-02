
/**
 * @author BianWenKai
 * @Data 2021/6/2 - 20:00
 **/

/**策略模式
 * Duck有四种属性，分别是样子，游泳，飞，叫；
 * 每个鸭子的样子都是不一样的，我们就可以将其设计为抽象方法，所有鸭子都需要实现该方法。
 * 由于游泳是所有鸭子都具备的，所以我们可以让所有鸭子都继承抽象父类中的swim方法。
 * 而飞和叫这两种属性是变化的，有用翅膀飞的，又不会飞的，有嘎嘎叫的，还有吱吱叫的。
 * 我们如何设计来实现我们的鸭子的飞和叫的行为呢，是在每个鸭子中都去实现一下吗，NO，这样大大增加了我们的代码冗余。因为可能有很多种类的鸭子都是用翅膀飞，嘎嘎叫的
 * 我们需要将这种变化的抽离出来，使用接口来表示飞和叫的行为，具体的咋飞咋叫通过具体类去实现接口。
 */
public class Main {
    public static void main(String[] args) {

        Duck duck = new ModelDuck();
        duck.display();;
        duck.swim();
        duck.performFly();
        duck.performQuack();

        System.out.println("--------------------------------------");

        Duck duck1 = new MallardDuck();
        duck1.display();
        duck1.swim();
        duck1.performFly();
        duck1.performQuack();


    }
}
