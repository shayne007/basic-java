import java.util.ArrayList;
import java.util.List;

public final class SingletonDoubleCheck {
    private List<String> list = null;
    public volatile static SingletonDoubleCheck instance = null;
    private SingletonDoubleCheck(){
        list = new ArrayList<String>();
    }
    public static SingletonStarve getInstance(){
        if(instance==null){
            synchronized(SingletonDoubleCheck.class){
                if(instance==null){
                    instance = new SingletonDoubleCheck();
                }
            }

        }
        return instance;
    }
}