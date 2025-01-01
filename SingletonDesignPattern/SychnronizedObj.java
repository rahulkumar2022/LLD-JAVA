package SingletonDesignPattern;

public class SychnronizedObj {
    
    private static SychnronizedObj instance;

    private SychnronizedObj() {
    }

    public static synchronized SychnronizedObj getInstance() {
        if(instance==null) instance = new SychnronizedObj();
        return instance;
    }

}
