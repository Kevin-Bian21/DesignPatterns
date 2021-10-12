/**
 * @author BianWenKai
 * @DATE 2021/10/12 - 13:07
 **/
public class SingletonOfDoubleCheckedLock {

    private volatile static SingletonOfDoubleCheckedLock uniqueInstance;

    private SingletonOfDoubleCheckedLock(){}

    public SingletonOfDoubleCheckedLock getInstance(){
        if (uniqueInstance == null) {
            synchronized (SingletonOfDoubleCheckedLock.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonOfDoubleCheckedLock();
                }
            }
        }
        return uniqueInstance;
    }

}
