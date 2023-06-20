package corejava5;

public class StaticDemo
{
    static int Num1 = 100;
    static int Num2 = 200;
    static void displayNum1()
    {
        System.out.println("num1 " + Num1);
    }

    static
    {
        System.out.println("From static block");
        System.out.println("Product: " + Num1*Num2);
    }

}
