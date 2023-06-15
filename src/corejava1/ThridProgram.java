package corejava1;

import java.util.Scanner;
public class ThridProgram {
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println("please input the trangle side(intNumber):");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            if(a < 0)
            {
                break;
            }
            int b = scanner.nextInt();
            if(b < 0)
            {
                break;
            }

            int c = scanner.nextInt();
            if(a < 0)
            {
                break;
            }
            //System.out.println(isSquare(a,b));
            System.out.println(triangleType(a,b,c));
        }
    }

    public static String isSquare(int length, int width)
    {
        return length == width? "is square": "is rectangular";
    }

    public static String triangleType(int a, int b, int c)
    {
        if( (a+b)<=c || (a+c)<=b || (b+c)<=a)
        {
            return "not a triangle";
        }
        else
        {
            if(a == b)
            {
                if(a==c)
                {
                    return "Equilateral";
                }
                else
                {
                    return "Isosceles";
                }
            }
            else if(a == c)
            {
                return "Isosceles";
            }
            else
            {
                return "Scalene";

            }
        }
    }
}
