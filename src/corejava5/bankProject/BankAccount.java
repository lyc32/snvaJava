package corejava5.bankProject;

public class BankAccount
{
    private String id;
    private String password;
    private String userName;

    private double balance;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccount(String userName, String id, String password, double balance)
    {
        this.userName = userName;
        this.id = id;
        this.password = password;
        this.balance = balance;
    }
    public void printInfo()
    {
        System.out.println("------------------------");
        System.out.println(String.format("Name    : %10s",this.userName));
        System.out.println(String.format("User ID : %10s",this.password));
        System.out.println(String.format("Password: %10s",this.password));
        System.out.println("________________________");
    }
}
