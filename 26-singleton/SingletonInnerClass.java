import java.util.ArrayList;
import java.util.List;

public final class SingletonInnerClass {
    public List<String> list = null;
    
    private SingletonInnerClass(){
        list = new ArrayList<String>();
    }

    public static class  SingletonInnerClassInstance{
        private static SingletonInnerClass instance = new SingletonInnerClass();
    }
    public static SingletonInnerClass getInstance(){
        return SingletonInnerClassInstance.instance;
    }
}