import java.util.ArrayList;
import java.util.List;

public final class SingletonStarve {
    private List<String> list = null;
    public static SingletonStarve instance = new SingletonStarve();
    private SingletonStarve(){
        list = new ArrayList<String>();
    }
    public static SingletonStarve getInstance(){
        return instance;
    }
}




