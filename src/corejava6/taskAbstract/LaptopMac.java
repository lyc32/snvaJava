package corejava6.taskAbstract;

public class LaptopMac extends Categorize
{
    private Item[] itemList;

    public LaptopMac()
    {
        super("Mac");
    }

    @Override
    public void setItemList(Item[] itemList)
    {
        this.itemList = itemList;
    }

    @Override
    public Item[] getItemList()
    {
        return this.itemList;
    }

    @Override
    public void setSubCategorize(Categorize[] subCategorizeList) { }

    @Override
    public Categorize[] getSubCategorize()
    {
        return null;
    }

}
