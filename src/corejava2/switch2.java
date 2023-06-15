package corejava2;

import java.util.Scanner;

public class switch2
{
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("please input a letter:");
            Scanner scanner = new Scanner(System.in);
            String letter = scanner.next();
            if((letter.length() == 1)&&(Character.isLetter(letter.charAt(0))))
            {
                switch (letter)
                {
                    case "a":
                        System.out.println(letter + " is vowel");
                        break;
                    case "e":
                        System.out.println(letter + " is vowel");
                        break;
                    case "i":
                        System.out.println(letter + " is vowel");
                        break;
                    case "o":
                        System.out.println(letter + " is vowel");
                        break;
                    case "u":
                        System.out.println(letter + " is vowel");
                        break;
                    case "A":
                        System.out.println(letter + " is vowel");
                        break;
                    case "E":
                        System.out.println(letter + " is vowel");
                        break;
                    case "I":
                        System.out.println(letter + " is vowel");
                        break;
                    case "O":
                        System.out.println(letter + " is vowel");
                        break;
                    case "U":
                        System.out.println(letter + " is vowel");
                        break;
                    default:
                        System.out.println(letter + " is consonant");
                }
            }
            else
            {
                if(letter.equals("-1"))
                {
                    break;
                }
                System.out.println("please just input one character");
            }
        }
    }
}
