package corejava5.bankProject;

public class BankAccountBusiness extends BankAccount
{
    private String address;

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public void printInfo()
    {
        System.out.println("------------------------");
        System.out.println(String.format("Name    : %10s",this.getUserName()));
        System.out.println(String.format("User ID : %10s",this.getId()));
        System.out.println(String.format("Password: %10s",this.getPassword()));
        System.out.println(String.format("Type    : %10s","Personal"));
        System.out.println("Address :\n" + this.address);
        System.out.println("________________________");
    }
}
