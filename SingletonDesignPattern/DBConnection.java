package SingletonDesignPattern;

public class DBConnection{
    private static final DBConnection connectionObj = new DBConnection();

    private DBConnection(){}

    public static DBConnection getInstance(){
        return connectionObj;
    }
}