package corejava3;

import java.util.Scanner;

public class ArrayTesk2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your name:");
        String studentName = scanner.next();
        System.out.println("please input your ID:");
        int studentId = scanner.nextInt();
        System.out.println("please input your branch:");
        String studentBranch = scanner.next();
        System.out.println("please input your SEM:");
        int studentSEM = scanner.nextInt();
        System.out.println("please input the number of subject");
        int count = scanner.nextInt();
        String[] subjectArray = new String[count];
        System.out.println("please input you subject name and grade:\neg: java 80");
        int[] subjectGrade = new int[count];
        int total = 0;
        for(int i = 0; i < count; i++)
        {
            subjectArray[i] = scanner.next();
            subjectGrade[i] = scanner.nextInt();
            total = total + subjectGrade[i];
        }

        System.out.println("here is your report card");
        float avg = (float) total/count;

        System.out.println("---------------------------------------");
        System.out.println("|    CIT        Report        Card    |");
        System.out.println("----------------------------------------");
        System.out.println(String.format("| %8s %8d %8s %8s |", studentName, studentId, studentBranch, studentSEM));
        System.out.println("----------------------------------------");

        for (int i = 0; i< count; i++)
        {
            System.out.println(String.format( "| %4d) %16s %8d     |",i,subjectArray[i], subjectGrade[i]));
        }
        System.out.println("----------------------------------------");
        String grade;
        if(avg>90)
        {
            grade = "A++";
        }
        else if(avg>80)
        {
            grade = "A+";
        }
        else if(avg>70)
        {
            grade = "B+";
        }
        else if(avg>60)
        {
            grade = "B";
        }
        else if(avg>50)
        {
            grade = "C";
        }
        else
        {
            grade = "D";
        }
        System.out.println(String.format( "| total:%4d  Avg:%2.2f  Grade:%3s |",total,avg, grade));
    }
}
