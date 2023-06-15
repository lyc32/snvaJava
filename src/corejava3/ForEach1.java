package corejava3;

public class ForEach1
{
    public static void main(String[] args) {
        float num[] = {99, 100,90,87, 88, 95};
        float sum = 0;
        for (float i:num)
        {
            System.out.println(i);
            sum += i;
        }
        System.out.println("total marks is "+sum);
    }
}
