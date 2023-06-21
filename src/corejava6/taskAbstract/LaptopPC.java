package corejava6.taskAbstract;

public class LaptopPC extends Categorize
{
    private Item[] itemList;

    public LaptopPC()
    {
        super("PC");
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
