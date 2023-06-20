package corejava5;

public class Rectangle extends Figure
{
    Rectangle(double r1, double r2)
    {
        super(r1,r2);
    }

    @java.lang.Override
    double area()
    {
        System.out.println("Area of Rectangle:");
        return r1*r2;
    }
}
