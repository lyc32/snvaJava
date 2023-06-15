package corejava3;

import java.util.Scanner;

public class Array1
{
    public static void main(String[] args) {
        String[] monthArray = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct","Nov", "Dec"};
        System.out.println("please input the month number of your birthday");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println("your birthday is in "+ monthArray[month-1]);
    }
}
