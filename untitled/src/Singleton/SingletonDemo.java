package Singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        //Eager singleton
        EagerSingleton eager = EagerSingleton.getInstance();
        eager.showMessage();

        //Lazy Singleton
        LazySingleton lazy = LazySingleton.getInstance();
        lazy.showMessage();

        //Static Singleton
        StaticSingleton stat = StaticSingleton.getInstance();
        stat.showMessage();

        //Thread Safe Singleton
        ThreadSafeSingleton tss = ThreadSafeSingleton.getInstance();
        tss.showMessage();

        //Bill Pugh Singleton
        BillPughSingleton bps = BillPughSingleton.getInstance();
        bps.showMessage();
    }
}
