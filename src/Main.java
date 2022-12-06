import Shapes.Rectangle;

public class Main {
    public static void main(String[] args)
    {

        var rec2D = Rectangle.create(2.5f, 2.5f);
        var rec3D = Rectangle.create(2.5f, 2.5f, 2.5f);
        rec2D.printValues();
        rec3D.printValues();
    }
}