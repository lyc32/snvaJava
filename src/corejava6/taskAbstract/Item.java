package corejava6.taskAbstract;

public class Item
{
    private int id;
    private String itemName;
    private float price;
    private int quantity;

    public Item(int id, String itemName, float price, int quantity)
    {
        this.id = id;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getItemId(){return this.id;}
    public String getItemName() {
        return itemName;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean sell(int number)
    {
        if(this.quantity >= number)
        {
            this.quantity = this.quantity - number;
            return true;
        }
        return false;
    }
}
