/**
 * @author BianWenKai
 * @DATE 2021/10/12 - 9:54
 **/
public class Singleton {

    public static Singleton uniqueInstance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
