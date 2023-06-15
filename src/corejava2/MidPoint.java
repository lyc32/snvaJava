package corejava2;

import java.util.Scanner;

public class MidPoint
{
    public static void main(String[] args) {

    /*int i = 100;
		while(i<=120)
		{
			if(i%2==0)
			{
				System.out.println(i+"\n");
			}
			i++;
		}*/
        System.out.println("please enter start number:");
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = i;
        System.out.println("please enter end number:");
        int end = scanner.nextInt();

        if(i>end)
        {
            System.out.println("error: start number shoud less than end number");
        }
        else
        {
            while(j<=end)
            {

                i++;
                j = j + 2;

                if(j>end)
                {
                    System.out.println((i-1) + " " + i);
                    break;
                }
                if(j==end)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

}
