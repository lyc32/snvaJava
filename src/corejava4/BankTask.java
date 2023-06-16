package corejava4;

import java.util.Scanner;

class BankAccount
{
    private String userId;
    private String password;
    private double balance;

    public BankAccount(String userId, String password, double balance)
    {
        this.userId = userId;
        this.password = password;
        this.balance = balance;
    }

    public boolean chackLogIn(String userId, String password)
    {
        if(userId.equals(this.userId) && password.equals(this.password))
        {
            return true;
        }
        return false;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankTask
{
    public static void main(String[] args)
    {
        BankAccount bankAccount1 = new BankAccount("AB1001", "12345", 800);
        BankAccount bankAccount2 = new BankAccount("AB1002", "23456", 8000);
        BankAccount bankAccount3 = new BankAccount("AB1003", "345789", 10000);
        BankAccount bankAccount4 = new BankAccount("AB1004", "62033310", 2000);
        BankAccount bankAccount5 = new BankAccount("AB1005", "110108", -200);
        BankAccount[] bankAccountDB = new BankAccount[]{bankAccount1, bankAccount2, bankAccount3, bankAccount4, bankAccount5};

        System.out.println("Welcome to AB bank\nWhat is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hi " + userName);

        while (true)
        {
            System.out.println("please enter your accountID and password\n");
            String userId = scanner.next();
            String userPassword = scanner.next();
            boolean login = false;
            double balance = 0;
            for (BankAccount tmp: bankAccountDB)
            {
                if(tmp.chackLogIn(userId, userPassword))
                {
                    login = true;
                    balance = tmp.getBalance();
                    break;
                }
            }

            if(login)
            {
                System.out.println("your account balance is: " + balance);
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
