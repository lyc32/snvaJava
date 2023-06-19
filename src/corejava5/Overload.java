package corejava5;

public class Overload
{
    int num1 = 10, num2=20, sum;
    void sum()
    {
        sum = num1 + num2;
        System.out.println("sum:" + sum);
    }
    void sum(int j)
    {
        sum = num1 + num2 + j;
        System.out.println("sum:" + sum);
    }

}
