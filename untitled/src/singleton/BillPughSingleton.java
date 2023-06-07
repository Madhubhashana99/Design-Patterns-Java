package singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class Helper{
        private static final BillPughSingleton bps = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return Helper.bps;
    }

    public void showMessage(){
        System.out.println("Bill Pugh singleton....");
    }


}
