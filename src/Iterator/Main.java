package Iterator;

/**
 * @author BianWenKai
 * @DATE 2021/12/11 - 18:34
 **/
public class Main {

    public static void main(String[] args) {
        Browser history = new GoogleBrowser();
        history.push("https://www.bilibili.com");
        history.push("https://www.bilibili.com/account/history");
        history.push("https://www.bilibili.com/video/BV1EW411u7th?p=4&spm_id_from=pageDriver");

        System.out.println(history.back());
        System.out.println(history.back());
        System.out.println(history.back());


        System.out.println(history.next());
        System.out.println(history.next());
        System.out.println(history.next());

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }

}
