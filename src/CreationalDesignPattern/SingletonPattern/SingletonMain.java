package CreationalDesignPattern.SingletonPattern;

public class SingletonMain {
    public static void main(String[] args) {
        AppSettings appSettings= AppSettings.getInstance();
        AppSettings appSettings1= AppSettings.getInstance();

        System.out.println(appSettings.getDatabaseURL());
        System.out.println(appSettings1.getDatabaseURL());

        System.out.println(appSettings1==appSettings);
    }

}
