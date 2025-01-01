package SingletonDesignPattern;

public class DoubleLocking {
    
    private static DoubleLocking instance;

    private DoubleLocking(){}

    //@SuppressWarnings("DoubleCheckedLocking")
    public static DoubleLocking getInstance(){

        if(instance==null){
            synchronized(DoubleLocking.class){
                if(instance==null){
                    instance = new DoubleLocking();
                }
            }
        }
        return instance;
    }
}
