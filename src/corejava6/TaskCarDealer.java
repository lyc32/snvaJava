package corejava6;

import java.util.Scanner;

class SellRecord
{
    String carType;
    int sellNumber = 0;

    SellRecord(String carType)
    {
        this.carType = carType;
    }

    public void add(int sellNumber)
    {
        this.sellNumber = this.sellNumber + sellNumber;
    }
}

class SellReport
{
    final String SellReport;

    SellReport(SellRecord[] recordList,SellRecord[] oldRecordList)
    {
        String tmpSellreport = "==========Sell Report===========\n";
        for(int i=0; i<recordList.length; i++)
        {
            tmpSellreport = tmpSellreport + i + "." + recordList[i].carType + " today: " + recordList[i].sellNumber + " Monthly: " + (recordList[i].sellNumber+ oldRecordList[i].sellNumber) + "\n";
        }
        SellReport = tmpSellreport;
    }

    public String getSellreport() {
        return SellReport;
    }
}
class Seller
{
    String id;
    private static SellRecord[] sellRecords;

    Seller(String id)
    {
        this.id = id;
    }

    public static void setSellRecord(SellRecord[] sellRecords)
    {
        Seller.sellRecords = sellRecords;
    }
}
public class TaskCarDealer
{
    public static void main(String[] args)
    {
        Seller seller1 = new Seller("0001");
        Seller seller2 = new Seller("0002");
        Seller[] sellerList = new Seller[]{seller1,seller2};

        SellRecord sellRecord1 = new SellRecord("BMW X1");
        SellRecord sellRecord2 = new SellRecord("BMW X2");
        SellRecord sellRecord3 = new SellRecord("BMW X3");

        SellRecord[] RecordList = new SellRecord[]{sellRecord1,sellRecord2,sellRecord3};

        SellRecord oldSellRecord1 = new SellRecord("BMW X1");
        oldSellRecord1.add(10);
        SellRecord oldSellRecord2 = new SellRecord("BMW X2");
        oldSellRecord2.add(30);
        SellRecord oldSellRecord3 = new SellRecord("BMW X3");
        oldSellRecord3.add(21);
        SellRecord[] oldRecordList = new SellRecord[]{oldSellRecord1,oldSellRecord2,oldSellRecord2};

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("please input your seller id:");
            String id = scanner.next();
            int sellerIndex = -1;
            for(int i = 0; i < sellerList.length; i++)
            {
                if(sellerList[i].id.equals(id))
                {
                    sellerIndex = i;
                    break;
                }
            }
            if(sellerIndex < 0)
            {
                System.out.println("No such seller ID, please try again");
                continue;
            }

            System.out.println("please input the car type\n1.BMW X1\n2.BMW X2\n3.BMW X3");
            int carIndex = scanner.nextInt();
            while(true)
            {
                if(carIndex>0 && carIndex<4)
                {
                  System.out.println("please input how many cars you sell:");
                  int carNumber = scanner.nextInt();
                  RecordList[carIndex-1].add(carNumber);
                  break;
                }
                else
                {
                    System.out.println("wrong type Number, please try again");
                    carIndex = scanner.nextInt();
                }
            }

            System.out.println("Input Y to Exit, others to continue");
            if(scanner.next().equals("Y"))
            {
                SellReport sellReport = new SellReport(RecordList,oldRecordList);
                System.out.println(sellReport.getSellreport());
                break;
            }
        }
    }
}
