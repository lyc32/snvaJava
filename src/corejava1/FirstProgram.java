package corejava1;

import java.util.Scanner;

public class FirstProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name =  scanner.next();

        System.out.println("Enter Age");
        int age = Integer.parseInt(scanner.next());

        System.out.println("Enter Height");
        float height = Float.parseFloat(scanner.next());

        System.out.println(name + " is " + age + " of " + height);
    }
}
