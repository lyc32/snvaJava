package corejava5;

public class FigureMain
{
    public static void main(String[] args)
    {
        Rectangle rectangle = new Rectangle(10,10);
        Triangle triangle = new Triangle(10,8);
        Figure figure;
        figure = rectangle;
        System.out.println(figure.area());
        figure = triangle;
        System.out.println(figure.area());
    }
}
