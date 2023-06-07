public class LazySingleton {

    private static LazySingleton ls;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){

        if(ls==null){
            ls = new LazySingleton();
        }

        return ls;
    }

    public void showMessage(){
        System.out.println("Lazy Singleton....");
    }
}
