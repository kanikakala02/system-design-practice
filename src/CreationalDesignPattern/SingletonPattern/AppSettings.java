package CreationalDesignPattern.SingletonPattern;

public class AppSettings {
    public static AppSettings instance;
    private String databaseURL;
    private String databaseUsername;
    private String databasePassword;

    private AppSettings() {
        databasePassword="xyz";
        databaseUsername="abc";
        databaseURL="jdbc:mysql://localhost:3306/";
    }
    public static AppSettings getInstance(){
        if(instance==null){
            instance= new AppSettings();
        }
        return instance;
    }
    public String getDatabaseURL() {
        return databaseURL;
    }

    public String getDatabaseUsername() {
        return databaseUsername;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }
}
