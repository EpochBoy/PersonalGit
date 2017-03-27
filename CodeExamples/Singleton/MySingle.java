package singleton;

/**
 * Created by forneus on 21/11/2016.
 */
public class MySingle {

    private static MySingle instance;

    private MySingle() {
    }

    public static MySingle getInstance(){
        if (instance == null){
            instance = new MySingle();
        }
        return instance;
    }
}
