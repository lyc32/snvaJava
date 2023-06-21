package corejava6.taskAbstract;

public abstract class Categorize
{
    private String categorize;

    public Categorize(String categorize)
    {
        this.categorize = categorize;
    }

    public String getCategorize()
    {
        return categorize;
    }


    public abstract void setItemList(Item[] itemList);
    public abstract Item[] getItemList();
    public abstract void setSubCategorize(Categorize[] subCategorizeList);
    public abstract Categorize[] getSubCategorize();
}
