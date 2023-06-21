package corejava6.taskAbstract;

public class User
{
    private String id;
    private String pw;
    private float Credit;

    public User(String id, String pw, float credit) {
        this.id = id;
        this.pw = pw;
        Credit = credit;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public float getCredit() {
        return Credit;
    }

    public void useCredit(float credit)
    {
        System.out.println(this.Credit);
        System.out.println(credit);
        this.Credit = this.Credit - credit;
    }
}
