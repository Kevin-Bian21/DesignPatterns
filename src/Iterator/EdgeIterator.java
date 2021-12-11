package Iterator;

/**
 * @author BianWenKai
 * @DATE 2021/12/11 - 20:12
 **/
public class EdgeIterator implements Iterator {

    private EdgeBrowser edge;
    private int index = 0;

    public EdgeIterator(EdgeBrowser browser) {
        this.edge = browser;
    }

    @Override
    public boolean hasNext() {
        return index < edge.getCount();
    }

    @Override
    public Object next() {
        return edge.getUrls()[index ++];
    }
}
