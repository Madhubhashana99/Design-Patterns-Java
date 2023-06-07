package factory;

public class FactoryDemo {
    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();
        Shape item = sf.getShape("Square");
        item.draw();
    }
}
