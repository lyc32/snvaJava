package corejava2;

import java.util.Scanner;

public class NestedSwitch
{
    public static void main(String[] args)
    {
        System.out.println("please input you topic:\n1.JS,\n2.Java\n3.RDBMS\n");
        Scanner scanner = new Scanner(System.in);
        String topic = scanner.next();
        switch (topic)
        {
            case "JS":
            {
                System.out.println("please input you subtopic:\n1.JS_variable,\n2.ES6\n3.Promises\n");
                Scanner subscanner = new Scanner(System.in);
                String subTopic = scanner.next();
                switch (subTopic)
                {
                    case "JS_variable":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    case "ES6":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    case "Promises":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    default:
                        System.out.println("Unknown topic");
                }
                break;
            }
            case "Java":
            {
                System.out.println("please input you subtopic:\n1.CoreJava,\n2.Multithreading\n3.Spring\n");
                Scanner subscanner = new Scanner(System.in);
                String subTopic = scanner.next();
                switch (subTopic)
                {
                    case "CoreJava":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    case "Multithreading":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    case "Spring":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    default:
                        System.out.println("Unknown topic");
                }
                break;
            }
            case "RDMBS":
            {
                System.out.println("please input you subtopic:\n1.SQL,\n2.Oracle\n3.MySql\n");
                Scanner subscanner = new Scanner(System.in);
                String subTopic = scanner.next();
                switch (subTopic)
                {
                    case "SQL":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    case "Oracle":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    case "MySql":
                        System.out.println("You selected " + topic + " as topic and " + subTopic + " as sub topic");
                        break;
                    default:
                        System.out.println("Unknown topic");
                }
                break;
            }
            default:
                System.out.println("Unknown topic");
        }
    }
}
