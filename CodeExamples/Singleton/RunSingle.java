package singleton;

/**
 * Created by forneus on 21/11/2016.
 */
public class RunSingle {

    public static void main(String[] args) {
        MySingle s = MySingle.getInstance();
        System.out.println(s);
        MySingle ss = MySingle.getInstance();
        System.out.println(ss);
    }
}
