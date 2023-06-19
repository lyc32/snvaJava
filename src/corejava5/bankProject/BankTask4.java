package corejava5.bankProject;

import java.util.Scanner;

public class BankTask4
{
    public static void main(String[] args)
    {
        BankAccountPersonal p1 = new BankAccountPersonal();
        p1.setAccount("Jim","AB1001","12345", 800);
        Address address1 = new Address();
        address1.doorNo = 405;
        address1.stateName = "IL";
        address1.cityName = "Chicago";
        address1.zipCode = "60661";
        address1.streetName = "Madison";
        address1.direction = "W";
        address1.streetNo = 605;
        p1.setAddress(address1);

        BankAccountPersonal p2 = new BankAccountPersonal();
        p2.setAccount("Tom","AB1004","12345", 200);
        Address address2 = new Address();
        address2.doorNo = -1;
        address2.stateName = "IL";
        address2.cityName = "Chicago";
        address2.zipCode = "60608";
        address2.streetName = "32nd";
        address2.direction = "W";
        address2.streetNo = 1346;
        p2.setAddress(address2);

        BankAccountPersonal p3 = new BankAccountPersonal();
        p3.setAccount("Lucky","AB1005","12345", 1000);
        Address address3 = new Address();
        address3.doorNo = 305;
        address3.stateName = "IL";
        address3.cityName = "Chicago";
        address3.zipCode = "60605";
        address3.streetName = "State";
        address3.direction = "S";
        address3.streetNo = 525;
        p3.setAddress(address3);

        BankAccountBusiness p4 = new BankAccountBusiness();
        p4.setAccount("Apple","AB1002","12345", 1000000000);
        p4.setAddress("One Apple Park Way\nCupertino, CA 95014, U.S.A.");

        BankAccountBusiness p5 = new BankAccountBusiness();
        p5.setAccount("Google","AB1003","12345", 20000000);
        p5.setAddress("1600 Amphitheatre Parkway Mountain View\nCA 94043, USA.");




        BankAccount[]  perAccountList = new BankAccountPersonal[]{p1,p2,p3};
        BankAccount[]  busAccountList = new BankAccountBusiness[]{p4,p5};

        System.out.println("Welcome to AB bank\nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName =  scanner.next();
        TmpInfoGetBalance tmpInfoGetBalance = new TmpInfoGetBalance();
        tmpInfoGetBalance.sayHello(userName);

        while (true)
        {
            // account type
            int type;
            for(;true;)
            {
                System.out.println("Please select your Account Type:\n 1 for personal\n 2.for business\n");
                 type = scanner.nextInt();
                if(type == 1 || type == 2)
                {
                    break;
                }
                else
                {
                    System.out.println("You enter a wrong number, please try again\n");
                }
            }

            for(;true;)
            {
                // login
                System.out.println("Please enter your Account Id:");
                String id = scanner.next();
                System.out.println("Please enter your password:");
                String password = scanner.next();
                if(type == 1)
                {
                    if(tmpInfoGetBalance.checkLogin(perAccountList,id,password) == true)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("your ID and password not match\nDo you want to try again.");
                        String tryAgain = scanner.next();
                        if(tryAgain.equals("No"))
                        {
                            break;
                        }
                    }
                }
                else
                {
                    if(tmpInfoGetBalance.checkLogin(busAccountList,id,password) == true)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("your ID and password not match\nDo you want to try again.");
                        String tryAgain = scanner.next();
                        if(tryAgain.equals("No"))
                        {
                            break;
                        }
                    }
                }

            }

            System.out.println("Do you want to check your Balance?");
            if(("Yes").equals(scanner.next()))
            {
                System.out.println("your account balance is: " + tmpInfoGetBalance.getBalance());
            }

            System.out.println("Do you want to logout or re-login? \nEnter Yes to logout");
            if(("Yes").equals(scanner.next()))
            {
                break;
            }
        }
    }
}
