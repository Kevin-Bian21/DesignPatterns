package Iterator;

/**
 * @author BianWenKai
 * @DATE 2021/12/11 - 18:10
 **/
public interface Browser {

    void push(String url);

    String back();

    String next();

    Iterator createIterator();

}
