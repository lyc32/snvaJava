package corejava6;

public class Ferrari extends Car
{
    Ferrari()
    {
        super("Ferrari");
    }
/*
    public void setFeature(String color, double topSpeed, int type, boolean convertible)
    {
        super.setFeature(color, topSpeed, type, convertible);
    }
*/
    public String feature(String color)
    {
        return this.color;
    }

    public double feature(double topSpeed)
    {
        return this.topSpeed;
    }

    public boolean feature(boolean convertible)
    {
        return this.convertible;
    }

    public String feature(int type)
    {
        String tmpType;
        if(this.type == 1)
        {
            tmpType = "sports";
        }
        else
        {
            tmpType = "coupe";
        }
        return tmpType;
    }
}
