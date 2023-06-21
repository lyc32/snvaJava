package corejava6.taskAbstract;

public class Accessory extends Categorize
{
    private Item[] itemList;

    public Accessory()
    {
        super("Accessories");
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
    public void setSubCategorize(Categorize[] subCategorizeList)
    {

    }

    @Override
    public Categorize[] getSubCategorize()
    {
        return null;
    }

}
