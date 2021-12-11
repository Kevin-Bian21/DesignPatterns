package Iterator;

/**
 * @author BianWenKai
 * @DATE 2021/12/11 - 19:38
 **/
public class EdgeBrowser implements Browser {

    String[] urls = new String[10];
    private Integer index = -1;
    private int count = 0;


    @Override
    public void push(String url) {
        urls[++ index] = url;
        count ++;
    }

    @Override
    public String back() {
        if (index <= 0)
            return null;
        return urls[-- index];
    }

    @Override
    public String next() {
        if (index >= urls.length - 1)
            return null;
        return urls[++ index];
    }

    @Override
    public Iterator createIterator() {
        return new EdgeIterator(this);
    }


    public String[] getUrls() {
        return urls;
    }

    public Integer getCount() {
        return count;
    }
}
