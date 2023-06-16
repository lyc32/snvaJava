package corejava4;

import java.util.Scanner;

class BankA
{
    private String userName;
    double balance;

    public BankA()
    {
    }

    public void sayHello(String userName)
    {
        this.userName = userName;
        System.out.println("Hi " + userName);
    }
}

class BankB extends BankA
{
    private String[] accountList;
    private String[] passwordList;
    private double[] balanceList;
    public BankB()
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
                this.balance = this.balanceList[i];
                return true;
            }
        }
        return false;
    }
}

class BankC extends BankB
{
    public BankC()
    {}
    public Double getBalance()
    {
        return this.balance;
    }
}
public class BankTask2
{
    public static void main(String[] args)
    {
        String[] accountList = {"AB1001","AB1002","AB1003","AB1004","AB1005"};
        String[] passwordList = {"12345","23456","345789", "62033310", "110108"};
        double[] balanceList = {800,8000,10000,2000,-200};

        BankC bankC = new BankC();
        bankC.setData(accountList,passwordList,balanceList);

        System.out.println("Welcome to AB bank\nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        bankC.sayHello(scanner.next());
        while (true)
        {
            System.out.println("please enter your accountID and password\n");
            String userId = scanner.next();
            String userPassword = scanner.next();
            boolean login = bankC.checkLogin(userId,userPassword);
            if(login)
            {
                System.out.println("your account balance is: " + bankC.balance);
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
