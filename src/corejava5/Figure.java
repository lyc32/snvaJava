package corejava5;

public abstract class Figure
{
    double r1,r2;

    Figure(double r1,double r2)
    {
        this.r1 = r1;
        this.r2 = r2;
    }

    abstract double area();
}

