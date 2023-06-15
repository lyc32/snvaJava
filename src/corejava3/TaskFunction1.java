package corejava3;

class Task
{
    public int a;
    public int b;
    public int c;
    public int pro;

    Task()
    {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    /*Task(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }*/

    int function1()
    {
        return a+b+c;
    }
    public void function2()
    {
        this.pro = a * b * c;
    }

}

public class TaskFunction1
{
    public static void main(String[] args)
    {

        Task task = new Task();
        System.out.println("the sum is: " + task.a + "+" + task.b + "+" + task.c + "=" + task.function1());
        task.function2();
        System.out.println("the product is: " + task.a + "*" + task.b + "*" + task.c + "=" + task.pro);
    }
}
