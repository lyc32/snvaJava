package corejava2;

import java.util.Scanner;
import java.util.concurrent.Callable;

class Loop implements Runnable
{

    @Override
    public void run()
    {
        GetInput getInput = new GetInput();
        getInput.run();
        for(;test.flage;)
        {
            System.out.println("Java is Easy to Learn!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class GetInput implements Runnable
{
    @Override
    public void run()
    {
        Scanner scanner = new Scanner(System.in);
        if(("No").equals(scanner.next()))
        {
            test.flage = false;
        }
        else
        {
            this.run();
        }
    }
}

public class test
{
    public static boolean flage = true;

    public static void main(String[] args)
    {
        Loop forLoop = new Loop();
        forLoop.run();
    }
}
