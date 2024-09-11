package DesignPatterns.Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;
    String url;
    String username;
    String password;

    private DatabaseConnection(){

    }

    //Double check locking
    public static DatabaseConnection getInstance(){

        if(instance == null){
            synchronized (DatabaseConnection.class){
                if(instance == null)
                    instance = new DatabaseConnection();
            }
        }
        return instance;
    }
}
