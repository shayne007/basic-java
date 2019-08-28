import java.util.ArrayList;
import java.util.List;

public final class SingletonEnum {
    private List<String> list = null;
  
    private SingletonEnum(){
        list = new ArrayList<String>();
    }
    private static SingletonEnum instance = null;

    public static SingletonEnum getInstance(){
        return Singleton.SINGLETON.instance;
    }
    private enum Singleton{
        SINGLETON;
        private SingletonEnum instance;
        Singleton(){
            instance = new SingletonEnum();
        }
        public  SingletonEnum getInstance(){
            return instance;
        }
    }
}




