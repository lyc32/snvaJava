package corejava5;

public class OverloadSub extends Overload
{
    int sum(int i, int j)
    {
        return i + j;
    }

    int sum(int i, int j, int k)
    {
        return i + j + k;
    }

}
