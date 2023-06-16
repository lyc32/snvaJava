package corejava4;

import java.util.Scanner;

class Address
{
    private int doorNo;
    private int streetNo;
    private String direction;
    private String streetName;
    private String cityName;
    private String stateName;
    private String zipCode;

    public void setAddress()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your Street No:");
        streetNo = scanner.nextInt();
        System.out.println("please input the Street direction: W E N S");
        direction = scanner.next();
        System.out.println("please input the Street Name:");
        streetName = scanner.next();
        System.out.println("please input your apt No:");
        doorNo = scanner.nextInt();
        System.out.println("please input your city name:");
        cityName = scanner.next();
        System.out.println("please input your state:");
        stateName = scanner.next();
        System.out.println("please input your ZipCode:");
        zipCode = scanner.next();
        System.out.println("your address is:");
        System.out.println(this.getAddress());
    }

    public String getAddress()
    {
        return streetNo + " " + direction + " " + streetName + " ST\nAPT " + doorNo + "\n" + cityName + ", " + stateName + "\n" + zipCode;
    }
}
class userAccount
{
    private String userName;
    private String address;
    private double balance;

    public userAccount()
    {}

    public void setAddress(Address address)
    {
        this.address = address.getAddress();
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
        return this.address;
    }

    public void sayHello(String userName)
    {
        this.userName = userName;
        System.out.println("Hi " + userName);
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class Login extends userAccount
{
    private String[] accountList;
    private String[] passwordList;
    private double[] balanceList;
    public Login()
    {}
    public void setData(String[] accountList, String[] passwordList, double[] balanceList)
    {
        this.accountList = accountList;
        this.balanceList = balanceList;
        this.passwordList = passwordList;
    }

    public boolean checkLogin(String userId, String userPass)
    {
        for(int i = 0; i < accountList.length; i++)
        {
            if(accountList[i].equals(userId)&&passwordList[i].equals(userPass))
            {
                this.setBalance(this.balanceList[i]);
                return true;
            }
        }
        return false;
    }
}

class GetBalance extends Login
{
    public GetBalance()
    {}
    public double getBalance()
    {
        return super.getBalance();
    }
}
public class BankTask3
{
    public static void main(String[] args)
    {
        String[] accountList = {"AB1001","AB1002","AB1003","AB1004","AB1005"};
        String[] passwordList = {"12345","23456","345789", "62033310", "110108"};
        double[] balanceList = {800,8000,10000,2000,-200};

        GetBalance getBalance = new GetBalance();
        getBalance.setData(accountList,passwordList,balanceList);

        System.out.println("Welcome to AB bank\nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        getBalance.sayHello(scanner.next());

        System.out.println("please input your address: \nenter 1 input by step\nenter 2 input full address");
        int chooice = scanner.nextInt();
        if(chooice == 1)
        {
            Address address = new Address();
            address.setAddress();
            getBalance.setAddress(address);
        }
        else
        {
            String address = "";
            System.out.println("please input your full address, ending with #");
            while (scanner.hasNextLine())
            {
                String tmp = scanner.nextLine();
                if(tmp.equals("#"))
                {
                    break;
                }
                else
                {
                    address = address + "\n" + tmp;
                }
            }
            getBalance.setAddress(address);
            System.out.println("your address is:");
            System.out.println(getBalance.getAddress());
        }


        while (true)
        {
            System.out.println("please enter your accountID and password\n");
            String userId = scanner.next();
            String userPassword = scanner.next();
            boolean login = getBalance.checkLogin(userId,userPassword);
            if(login)
            {
                System.out.println("your account balance is: " + getBalance.getBalance());
                System.out.println("Do you want to logout?\nenter Yes to logout or enter any key to re-login");
                String tryAgain = scanner.next();
                if(tryAgain.equals("Yes"))
                {
                    break;
                }
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
}
