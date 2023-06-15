package corejava1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class pastry
{
    private String name;
    private float price;
    private int count = 0;

    pastry(String name, float price)
    {
        this.name = name;
        this.price = price;
    }
    public String getName()
    {
        return this.name;
    }
    public void count()
    {
        this.count++;
    }
    public float getSum()
    {
        return price*count;
    }

    public void print()
    {
        System.out.printf("%14s %.2f %6d  %.2f\n", this.name, this.price, this.count, getSum());
    }
}
public class SecondProgram
{
    public static void main(String[] args)
    {

        String menu =   "|   Pastries   | price |\n" +
                        "  blackCurrent    $5   \n" +
                        "  whiteForest     $3   \n" +
                        "  chocolate       $4   \n" +
                        "  redVelvet       $4.5 \n";

        pastry blackCurrent = new pastry("blackCurrent", 5);
        pastry whiteForest  = new pastry("whiteForest" , 3);
        pastry chocolate    = new pastry("chocolate"   , 4);
        pastry redVelvet    = new pastry("redVelvet"   , 4.5f);

        List<pastry> pastryList = new ArrayList<>();
        pastryList.add(blackCurrent);
        pastryList.add(whiteForest);
        pastryList.add(chocolate);
        pastryList.add(redVelvet);

        while(true)
        {
            System.out.println(menu);
            System.out.println("please input what you want to buy?");
            Scanner scanner = new Scanner(System.in);
            String tmp = scanner.next();
            if(tmp.equals(pastryList.get(0).getName()))
            {
                pastryList.get(0).count();
            }
            else if(tmp.equals(pastryList.get(1).getName()))
            {
                pastryList.get(1).count();
            }
            else if(tmp.equals(pastryList.get(2).getName()))
            {
                pastryList.get(2).count();
            }
            else if(tmp.equals(pastryList.get(3).getName()))
            {
                pastryList.get(3).count();
            }
            else if(tmp.equals("exit"))
            {
                break;
            }
            else
            {
                System.out.println("Wrong pastry name, please enter 'exit' to end, or try again");
            }
        }

        System.out.printf("%14s %3s %2s %3s\n", "name", "price", "number", "total");
        pastryList.get(0).print();
        pastryList.get(1).print();
        pastryList.get(2).print();
        pastryList.get(3).print();
        float sum = pastryList.get(0).getSum() + pastryList.get(1).getSum() + pastryList.get(2).getSum() + pastryList.get(3).getSum();
        System.out.println("Total: " + sum);
    }
}
