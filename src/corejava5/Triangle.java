package corejava5;

public class Triangle extends Figure
{
    Triangle(double r1, double r2)
    {
        super(r1,r2);
    }
    @java.lang.Override
    double area()
    {
        System.out.println("Area of Triangle: ");
        return r1*r2/2;
    }
}
