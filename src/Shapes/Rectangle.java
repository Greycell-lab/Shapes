package Shapes;

public class Rectangle
{
    public float a;
    public float b;
    public float h;
    public Rectangle(float a, float b)
    {
        this.a = a;
        this.b = b;
    }
    public Rectangle(float a, float b, float h)
    {
        this.a = a;
        this.b = b;
        this.h = h;
    }
    public static Rectangle create(float a, float b)
    {
        return new Rectangle(a, b);
    }
    public static Rectangle create(float a, float b, float h)
    {
        return new Rectangle(a, b, h);
    }
    public float getArea()
    {

        if(h!=0) return 2*a*b+2*a*h+2*b*h;
        else return a*b;
    }
    public float getPerimeter()
    {
        if(h!=0) return 4*a+4*b;
        else return 2*(a+b);
    }
    public float getVolume()
    {
        if(h!=0) return a*b*h;
        else return 0;
    }
    public void printValues()
    {
        System.out.println("********************");
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        if(h!=0) System.out.println("Volume: " + getVolume());
        System.out.println("********************");
    }
}
