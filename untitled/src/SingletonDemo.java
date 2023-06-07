public class SingletonDemo {
    public static void main(String[] args) {
        //Eager singleton
        EagerSingleton eager = EagerSingleton.getInstance();
        eager.showMessage();

        //Lazy Singleton
        LazySingleton lazy = LazySingleton.getInstance();
        lazy.showMessage();
    }
}
