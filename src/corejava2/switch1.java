package corejava2;

import java.util.Scanner;

public class switch1
{
    public static void main(String[] args)
    {
        System.out.println("Enter Month 1.January 2.Febuary ...");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        String season;
        switch (month) {
            case 1 -> season = "winter";
            case 2 -> season = "winter";
            case 3 -> season = "spring";
            case 4 -> season = "spring";
            case 5 -> season = "spring";
            case 6 -> season = "summer";
            case 7 -> season = "summer";
            case 8 -> season = "summer";
            case 9 -> season = "autumn";
            case 10 -> season = "autumn";
            case 11 -> season = "autumn";
            case 12 -> season = "winter";
            default -> season = "unkonwn month";
        }
        System.out.println("Month " + month + " fall in " + season);
    }
}
