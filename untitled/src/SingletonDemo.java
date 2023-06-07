public class SingletonDemo {
    public static void main(String[] args) {
        EagerSingleton eager = EagerSingleton.getInstance();
        eager.showMessage();

    }
}
