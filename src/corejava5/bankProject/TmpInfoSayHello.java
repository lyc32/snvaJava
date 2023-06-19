package corejava5.bankProject;

public class TmpInfoSayHello
{
    private String userName;
    double balance;
    public TmpInfoSayHello()
    {}

    public void sayHello(String userName)
    {
        this.userName = userName;
        System.out.println("Hi " + userName);
    }
}
