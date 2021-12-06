package singleton;

/**
 * @author BianWenKai
 * @DATE 2021/10/12 - 9:58
 **/
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
