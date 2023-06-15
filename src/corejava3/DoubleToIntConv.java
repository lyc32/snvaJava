package corejava3;

public class DoubleToIntConv
{
    public static void main(String[] args) {
        Double obj = new Double("23.89");
        int val = obj.intValue();
        System.out.println(val);
        float val2 = obj.floatValue();
        double d1;

        int num = 100;
        Integer integer = Integer.valueOf(100);
        System.out.println("integer:"+ integer);
        System.out.println("int:" + num);

    }
}
