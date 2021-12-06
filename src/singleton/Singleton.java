package singleton;

/**
 * @author BianWenKai
 * @DATE 2021/10/12 - 9:54
 **/
public class Singleton {

    //懒汉式
    private static Singleton uniqueInstance = null;

    private Singleton(){}
    //多线程下会产生多个实例变量，所以通过增加synchronized关键字在实例化方法中，迫使每个线程在进入该方法之前，必须等别的线程离开该方法，即不能有多个线程同时进入该方法。
    public static synchronized Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
