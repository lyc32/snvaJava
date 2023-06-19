package corejava5.bankProject;

public class TmpInfoLoginCheck extends TmpInfoSayHello
{
    public boolean checkLogin(BankAccount[] accountList, String id, String password)
    {
        for(int i = 0; i < accountList.length; i++)
        {
            if(id.equals(accountList[i].getId()) && password.equals(accountList[i].getPassword()))
            {
                this.balance = accountList[i].getBalance();
                accountList[i].printInfo();
                return true;
            }
        }
        return false;
    }
}
