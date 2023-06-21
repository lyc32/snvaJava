package corejava6.taskAbstract;

public class Laptop extends Categorize
{
    private Categorize[] subCategorizeList;

    public Laptop()
    {
        super("Laptop");
    }

    @Override
    public void setItemList(Item[] itemList)
    {
    }

    @Override
    public Item[] getItemList()
    {
        return null;
    }

    @Override
    public void setSubCategorize(Categorize[] subCategorizeList)
    {
        this.subCategorizeList = subCategorizeList;
    }

    @Override
    public Categorize[] getSubCategorize()
    {
        return this.subCategorizeList;
    }

}
