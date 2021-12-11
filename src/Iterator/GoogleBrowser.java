package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author BianWenKai
 * @DATE 2021/12/11 - 18:19
 **/
public class GoogleBrowser implements Browser {

    private List<String> urls = new ArrayList<>();
    private Integer index = -1;

    @Override
    public void push(String url) {
        urls.add(url);
        index ++;
    }

    @Override
    public String back() {
        //当后退到最初始位置时，无法在回退
        if (index <= 0)
            return null;
        return urls.get(-- index);
    }

    @Override
    public String next() {
        //当前进到最后一条历史记录时，无法再前进
        if (index >= urls.size() - 1)
            return null;
        return urls.get(++ index);
    }

    @Override
    public Iterator createIterator() {
        return new GoogleIterator(this);
    }

    public List<String> getUrls() {
        return urls;
    }

    public Integer getIndex() {
        return index;
    }
}
