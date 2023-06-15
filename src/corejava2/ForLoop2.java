package corejava2;

import java.util.Scanner;

public class ForLoop2
{
    public static void main(String[] args) {
        for(;;)
        {
            System.out.println("Java is Easy to Learn!");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(("No").equals(input))
            {
                break;
            }
            else if(("Yes").equals(input))
            {
                continue;
            }
            else
            {
                continue;
            }
        }
    }
}
