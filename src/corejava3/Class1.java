package corejava3;

class test
{
    int a;
    int b;
    int c;

    public test(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int result()
    {
        int res = a*3+b*5 - c*2;
        System.out.println(a+"*3 + " + b +"*5 - " + "c" + "*2 = " + res);
        return res;
    }
}


public class Class1
{

    public static void main(String[] args) {
        test t = new test(2,3,4);
        t.result();
    }

}
