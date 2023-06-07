package Singleton;

public class StaticSingleton {
    private static StaticSingleton ss;

    public StaticSingleton() {
    }

    static {
        try{
            ss = new StaticSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occured while creating the object..!!");
        }
    }

    public static StaticSingleton getInstance(){
        return ss;
    }

    public void showMessage(){
        System.out.println("Static Singleton....");
    }
}
