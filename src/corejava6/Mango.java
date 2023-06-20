package corejava6;

public class Mango extends Fruit
{
    Mango()
    {
        super("Mango");
        System.out.println("this is " + this.getClass() + " class");
        System.out.println(this.getClass() + "'s super class is " + this.getClass().getSuperclass());
    }

    @Override
    public void color()
    {
        System.out.println("Mango is Yellow.");
    }

    @Override
    public void avgWeight()
    {
        System.out.println("Mango's average weight is 200g." );
    }

}
