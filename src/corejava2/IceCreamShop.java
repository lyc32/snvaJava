package corejava2;

import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        String type11 = "blueberry";
        String type12 = "strawberry";
        String type13 = "chocolate";
        String type14 = "cream";

        String type21 = "chocolate";
        String type22 = "cream";
        String type23 = "blueberry";
        String type24 = "matcha";
        String type25 = "strawberry";

        float price11 = 4;
        float price12 = 3;
        float price13 = 4;
        float price14 = 5;

        float price21 = 6;
        float price22 = 7;
        float price23 = 10;
        float price24 = 5;
        float price25 = 5;

        System.out.println("Hello,welcome to ice cream shop\nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hey " + userName + "! How are you today?");
        String userInput = scanner.next();
        String bill = "===============BILL===================\n"
                     +"No.       Flavor       Price  Qty Amount\n"
                     +"======================================";
        float total = 0;

        int count = 0;
        while(true)
        {
            System.out.println("Would you like 1.Scoops or 2.Exquisite? \n Please input the number");
            int menuID = -1;
            for(;;)
            {
                menuID = scanner.nextInt();
                if(menuID!=1&&menuID!=2)
                {
                    System.out.println("wrong number, please try again");
                }
                else
                {
                    break;
                }
            }

            if(menuID == 1)
            {
                System.out.println("You choose Scoops, here is the menu:");
                System.out.println("================Scoops===================");
                System.out.println(String.format("%2d. %10s    $%4.2f", 1, type11, price11));
                System.out.println(String.format("%2d. %10s    $%4.2f", 2, type12, price12));
                System.out.println(String.format("%2d. %10s    $%4.2f", 3, type13, price13));
                System.out.println(String.format("%2d. %10s    $%4.2f", 4, type14, price14));
                System.out.println("=========================================");
            }
            else
            {
                System.out.println("You choose Exquisite, here is the menu:");

                System.out.println("================Exquisite================");
                System.out.println(String.format("%2d. %10s    $%4.2f", 1, type21, price21));
                System.out.println(String.format("%2d. %10s    $%4.2f", 2, type22, price22));
                System.out.println(String.format("%2d. %10s    $%4.2f", 3, type23, price23));
                System.out.println(String.format("%2d. %10s    $%4.2f", 4, type24, price24));
                System.out.println(String.format("%2d. %10s    $%4.2f", 5, type25, price25));
                System.out.println("=========================================");
            }
            System.out.println("\nPlease input the number you want");
            int typeID = -1;
            for(;;)
            {
                typeID = scanner.nextInt();
                if((menuID==1 && typeID>=1 && typeID<=4) || (menuID==2 && typeID>=1 && typeID<=5))
                {
                    break;
                }
                else
                {
                    System.out.println("wrong number, please try again");
                }
            }
            System.out.println("How many IceCream you wan to buy?");
            int numberOfIceCream = scanner.nextInt();
            System.out.println("\nhere is the bill:");
            count++;
            float sum = 0;
            switch (menuID)
            {
                case 1:
                {
                    switch (typeID)
                    {
                        case 1:
                        {
                            sum = price11*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Scoops "+type11,price11,numberOfIceCream,sum);
                            break;
                        }
                        case 2:
                        {
                            sum = price12*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Scoops "+type12,price12,numberOfIceCream,sum);
                            break;
                        }
                        case 3:
                        {
                            sum = price13*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Scoops "+type13,price13,numberOfIceCream,sum);
                            break;
                        }
                        case 4:
                        {
                            sum = price14*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Scoops "+type14,price14,numberOfIceCream,sum);
                            break;
                        }
                    }
                    break;
                }
                case 2:
                {
                    switch (typeID)
                    {
                        case 1:
                        {
                            sum = price21*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Exquisite "+type21,price21,numberOfIceCream,sum);
                            break;
                        }
                        case 2:
                        {
                            sum = price22*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Exquisite "+type22,price22,numberOfIceCream,sum);;
                            break;
                        }
                        case 3:
                        {
                            sum = price23*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Exquisite "+type23,price23,numberOfIceCream,sum);;
                            break;
                        }
                        case 4:
                        {
                            sum = price24*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Exquisite "+type24,price24,numberOfIceCream,sum);;
                            break;
                        }
                        case 5:
                        {
                            sum = price25*numberOfIceCream;
                            bill = bill + String.format("\n%2d %20s  %4.2f %3d  %4.2f",count, "Exquisite "+type25,price25,numberOfIceCream,sum);;
                            break;
                        }
                    }
                    break;
                }
            }
            total = total + sum;
            System.out.println(bill);
            System.out.println("======================================");
            System.out.println("total:" + total);
            System.out.println("======================================\n");
            System.out.println("Do you want more?");
            String reply = scanner.next();
            if(reply.equals("No"))
            {
                break;
            }
        }
        System.out.println("Your bill is here:\n" + bill);
        System.out.println("======================================");
        System.out.println("total:" + total);
        System.out.println("======================================\n");
    }
}
