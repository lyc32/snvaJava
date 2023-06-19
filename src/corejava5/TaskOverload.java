package corejava5;

public class TaskOverload
{
    public static void main(String[] args) {
        Overload overload = new Overload();
        OverloadSub overloadSub = new OverloadSub();
        overload.sum();
        System.out.println(overloadSub.sum(100,200));

        System.out.println("=======================");
        overloadSub.sum();
        overloadSub.sum(5);
        System.out.println(overloadSub.sum(5,10,7));
    }
}
