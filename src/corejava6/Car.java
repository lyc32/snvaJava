package corejava6;

public class Car
{
    String carName;
    String color;
    double topSpeed;
    int type;
    Boolean convertible;

    Car(String carName)
    {
        this.carName = carName;
    }

    public void setFeature(String color, double topSpeed, int type, boolean convertible)
    {
        this.type = type;
        this.color = color;
        this.topSpeed = topSpeed;
        this.convertible = convertible;
    }

    public String feature()
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
        return "color: "+ this.color + "\ntop Speed: " + this.topSpeed + "\ntype: " + tmpType + "\nconvertible: " + this.convertible;
    }
}
