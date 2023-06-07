package Singleton;

public class EagerSingleton {

    private static EagerSingleton es = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return es;
    }

    public void showMessage(){
        System.out.println("Eager Singleton....");
    }
}
