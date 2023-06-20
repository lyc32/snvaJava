package corejava6;

public class Apple extends Fruit
{
    Apple()
    {
        super("Apple");
        System.out.println("this is " + this.getClass() + " class");
        System.out.println(this.getClass() + "'s super class is " + this.getClass().getSuperclass());
    }

    @Override
    public void color()
    {
        System.out.println("Apple is RED.");
    }

    @Override
    public void avgWeight()
    {
        System.out.println("Apple's average weight is 100g." );
    }
}
