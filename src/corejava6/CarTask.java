package corejava6;

public class CarTask
{
    public static void main(String[] args)
    {
        Ferrari ferrari = new Ferrari();
        ferrari.setFeature("Red",200, 1, false);

        System.out.println("==============================");
        System.out.println("call super feature()");
        System.out.println(ferrari.feature());
        System.out.println("==============================");
        System.out.println("call sub feature()");
        System.out.println("My car type is: " + ferrari.feature(1));
        System.out.println("My car's top speed is: " + ferrari.feature(0.0));
        System.out.println("My car is convertible? " + ferrari.feature(true));
        System.out.println("My car's color is: " + ferrari.feature("color"));

    }
}
