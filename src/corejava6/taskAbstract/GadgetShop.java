package corejava6.taskAbstract;

import java.util.Scanner;

public class GadgetShop
{

    public static void printMenu(Categorize[] categorizes)
    {
        for(int i = 0; i < categorizes.length; i++)
        {
            System.out.println("\n==========================================");
            System.out.println("[" + categorizes[i].getCategorize() + "]");
            if(categorizes[i].getItemList()!=null)
            {

                System.out.println(String.format("%2s %15s %8s %4s", "Id","Item Name","Price","Qty"));
                System.out.println(String.format("=========================================="));
                for(int j = 0; j<categorizes[i].getItemList().length; j++)
                {
                    int id = categorizes[i].getItemList()[j].getItemId();
                    String itemName     = categorizes[i].getItemList()[j].getItemName();
                    float  itemPrice    = categorizes[i].getItemList()[j].getPrice();
                    int    itemQuantity = categorizes[i].getItemList()[j].getQuantity();
                    System.out.println(String.format("%2d %15s %8.2f %4d", id,itemName,itemPrice,itemQuantity));
                }
            }
            else
            {
                for(int j = 0; j < categorizes[i].getSubCategorize().length; j++)
                {
                    System.out.println(String.format("=========================================="));
                    Categorize tmp = categorizes[i].getSubCategorize()[j];
                    System.out.println("[" + tmp.getCategorize() + "]");
                    System.out.println(String.format("%2s %15s %8s %4s", "Id","Item Name","Price","Qty"));
                    System.out.println(String.format("=========================================="));
                    for(int k = 0; k<tmp.getItemList().length; k++)
                    {
                        int    id           = tmp.getItemList()[k].getItemId();
                        String itemName     = tmp.getItemList()[k].getItemName();
                        float  itemPrice    = tmp.getItemList()[k].getPrice();
                        int    itemQuantity = tmp.getItemList()[k].getQuantity();
                        System.out.println(String.format("%2d %15s %8.2f %4d", id,itemName,itemPrice,itemQuantity));
                    }
                }
            }
        }
        System.out.println("\n");
    }


    public static User checkLogin(User[] userList, String id, String pw)
    {
        User user = null;
        for(int i = 0; i< userList.length; i++)
        {
            if(userList[i].getId().equals(id)&&userList[i].getPw().equals(pw))
            {
                user = userList[i];
                break;
            }
        }
        return user;
    }

    public static void main(String[] args)
    {
        // set up items
        Item keyboard = new Item(7,"keyboard", 9.99f , 200);
        Item mouse    = new Item(8,"mouse"   , 3.99f , 150);
        Item webcam   = new Item(9,"webcam"  , 24.99f, 20 );
        Item[] accessoryList = new Item[]{keyboard,mouse,webcam};

        Item headset    = new Item(10,"headset"    , 9.99f , 1000);
        Item hdmiCable  = new Item(11,"HDMI cable" , 3.99f , 2000);
        Item coolingPad = new Item(12,"cooling Pad", 24.99f, 300 );
        Item[] othersList = new Item[]{headset,hdmiCable,coolingPad};

        Item macbookPro  = new Item(1,"MacBook Pro", 2000f , 2 );
        Item macbookAir  = new Item(2,"MacBook Air", 1000f , 0 );
        Item macMini     = new Item(3,"Mac mini"   , 500   , 20);
        Item[] macList = new Item[]{macbookPro,macbookAir,macMini};

        Item hp_i3  = new Item(4,"HP i3", 900f , 10);
        Item hp_i5  = new Item(5,"HP i5", 1000f, 5 );
        Item hp_i7  = new Item(6,"HP i7", 1500f, 5 );
        Item[] pcList = new Item[]{hp_i3,hp_i5,hp_i7};

        // set up Categorizes
        Categorize mac = new LaptopMac();
        mac.setItemList(macList);
        Categorize pc  = new LaptopPC();
        pc.setItemList(pcList);
        Categorize laptop = new Laptop();
        laptop.setSubCategorize(new Categorize[]{mac,pc});

        Categorize accessory = new Accessory();
        accessory.setItemList(accessoryList);

        Categorize others = new Others();
        others.setItemList(othersList);

        Categorize[] categorizes = new Categorize[]{laptop,accessory,others};

        // item List
        Item[] items = new Item[]{macbookPro,macbookAir,macMini,hp_i3,hp_i5,hp_i7,keyboard,mouse,webcam,headset,hdmiCable,coolingPad};

        // set up User list
        User user1 = new User("001", "1234", 500);
        User user2 = new User("002", "1234", 2000);
        User[] userList = new User[]{user1,user2};


        // say hello.....
        System.out.println("Welcome to Gadget Shop");
        Scanner scanner = new Scanner(System.in);

        // login
        User user = null;
        while(user==null)
        {
            System.out.println("Please input your ID:");
            String id = scanner.next();
            System.out.println("Please input your password:");
            String pw = scanner.next();
            user = checkLogin(userList, id,pw);
            if(user == null)
            {
                System.out.println("Your id and password not match, please try again.");
            }
        }

        // shopping
        Bill bill = new Bill();
        while(true)
        {
            printMenu(categorizes);
            System.out.println("Please enter the item id to buy:");
            int itemId = scanner.nextInt();
            System.out.println("How many do you want to buy？");
            int number = scanner.nextInt();

            bill.addItem2Bill(items,itemId,number);

            System.out.println("Do you have anything else to buy?\nEnter Y to continue, other key to Exit.");
            if(!scanner.next().equals("Y"))
            {
                break;
            }
        }

        if(user.getCredit()>0)
        {
            System.out.println("Do you want to use your credit? Enter Y to use, other key to skip.");
            if(scanner.next().equals("Y"))
            {
                bill.printBill(user,true);
            }
            else
            {
                bill.printBill(user,false);
            }
        }
        else
        {
            bill.printBill(user,false);
        }
    }
}
