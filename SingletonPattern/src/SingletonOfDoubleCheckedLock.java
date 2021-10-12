/**
 * @author BianWenKai
 * @DATE 2021/10/12 - 13:07
 **/
public class SingletonOfDoubleCheckedLock {

    //通过volatile关键字，确保多线程正确的处理 uniqueInstance 变量
    private volatile static SingletonOfDoubleCheckedLock uniqueInstance;

    private SingletonOfDoubleCheckedLock(){}

    //检查实例是否创建，如果尚未创建，则进行同步。这样只有第一次会同步。
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
