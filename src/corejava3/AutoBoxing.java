package corejava3;

public class AutoBoxing
{
    public static void main(String[] args) {
        long long1 = 87987;
        double double1 = 9898.987;

        // auto boxing
        Long longwarp = long1;
        Double doublewarp = double1;
        //System.out.println(longwarp + " " + doublewarp);

        // auto unBoxing
        long long2 = longwarp;
        double double2 = doublewarp;
        //System.out.println(long2 + " " + double2);


        float float1 = 0.99f;
        int int1 = 111;
        boolean boolean1 = true;

        //AutoBoxing
        Float floatwarp = float1;
        Integer intwarp = int1;
        Boolean booleanwarp = boolean1;
        System.out.println("AutoBoxing: int->Integer " + int1 + "->" + intwarp);
        System.out.println("AutoBoxing: float->Float " + float1 + "->" + floatwarp);
        System.out.println("AutoBoxing: boolean->Boolean " + boolean1 + "->" + booleanwarp);

        float float2 = floatwarp;
        int int2 = intwarp;
        boolean boolean2 = booleanwarp;


        System.out.println("AutoUNBoxing: Integer->int " + intwarp + "->" + int2);
        System.out.println("AutoUNBoxing: float->Float " + floatwarp + "->" + float2);
        System.out.println("AutoUNBoxing: boolean->Boolean " + booleanwarp + "->" + boolean2);
    }
}
