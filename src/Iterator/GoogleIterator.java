package Iterator;


/**
 * @author BianWenKai
 * @DATE 2021/12/11 - 18:09
 **/
public class GoogleIterator implements Iterator{

    private  GoogleBrowser google;
    private Integer index = 0;

    public GoogleIterator(GoogleBrowser browser) {
        this.google = browser;
    }

    @Override
    public boolean hasNext() {
        return index < google.getUrls().size();
    }

    @Override
    public Object next() {
        return google.getUrls().get(index ++);
    }
}
