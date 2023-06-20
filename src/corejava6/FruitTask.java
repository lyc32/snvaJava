package corejava6;

public class FruitTask
{
    public static void main(String[] args)
    {
        System.out.println("==========================");
        Fruit fruit = new Fruit("fruit");
        fruit.color();
        fruit.avgWeight();

        System.out.println("==========================");
        Apple apple = new Apple();
        apple.color();
        apple.avgWeight();

        System.out.println("==========================");
        Mango mango = new Mango();
        mango.color();
        mango.avgWeight();
    }
}
