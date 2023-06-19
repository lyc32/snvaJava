package corejava5.bankProject;

import java.util.Scanner;

public class Address
{
    public int doorNo;
    public int streetNo;
    public String direction;
    public String streetName;
    public String cityName;
    public String stateName;
    public String zipCode;

    public Address()
    {
        this.doorNo = -1;
        this.streetNo = -1;
        this.direction = "";
        this.streetName = "";
        this.stateName = "";
        this.cityName = "";
        this.zipCode = "";
    }

    public String getAddress()
    {
        String result = "";
        if(streetNo >= 0)
        {
            result = streetNo + " ";
        }

        if(!direction.equals(""))
        {
            result = result + direction + " ";
        }

        if(!streetName.equals(""))
        {
            result = result + streetName + "St\n";
        }

        if(doorNo >= 0)
        {
            result = result + "Unit "+ doorNo + "\n";
        }
        if(!cityName.equals(""))
        {
            result = result + cityName;
        }

        if(!stateName.equals(""))
        {
            result = result + "," + stateName + "\n";
        }
        if(!zipCode.equals(""))
        {
            result = result + zipCode;
        }
        return result;
    }
}
