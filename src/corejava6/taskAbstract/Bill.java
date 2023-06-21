package corejava6.taskAbstract;

public class Bill {
    private String bill = "==================BILL===================" + "\n" + String.format("%15s %8s %4s %8s", "Item Name", "Price", " Qty", "Total");
    private float total = 0;
    public void addItem2Bill(Item[] itemList, int id, int number)
    {
        Item tmp = null;
        for(int i = 0; i< itemList.length; i++)
        {
            if(itemList[i].getItemId() == id)
            {
                tmp = itemList[i];
                break;
            }
        }

        if(tmp != null)
        {
            if(tmp.sell(number))
            {

                total = total + tmp.getPrice()*number;
                bill = bill+ "\n" + String.format("%15s %8.2f %4d %8.2f", tmp.getItemName(), tmp.getPrice(), number, tmp.getPrice()*number);
            }
            else
            {
                System.out.println("Insufficient stock, purchase failed");
            }
        }
    }
    public void printBill(User user, boolean useCredit)
    {
        if(useCredit == true)
        {
            float userCredit = user.getCredit();
            if(total >= userCredit)
            {
                bill = bill+ "\n" + String.format("%15s %8.2f %4d %8.2f", "Your Credit", userCredit, 1, -1*userCredit);
                total = total - userCredit;
                user.useCredit(userCredit);
            }
            else
            {
                bill = bill+ "\n" + String.format("%15s %8.2f %4d %8.2f", "Your Credit", total, 1, total*(-1));
                user.useCredit(total);
                total = 0;
            }
        }

        bill = bill + "\n=========================================\n Total : " + total + "   Your Credit: " + user.getCredit();
        System.out.println(bill);

    }
}
