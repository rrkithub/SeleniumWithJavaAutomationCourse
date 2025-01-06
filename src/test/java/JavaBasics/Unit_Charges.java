package JavaBasics;

import java.util.Scanner;

public class Unit_Charges {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Electricity Unit : ");
        int unit = input.nextInt();
        double amt,surcharge,bill_amt;
        if(unit<=50)
        {
            amt = unit*0.50;
        }
        else if(unit<=150)
        {
            amt = unit*0.75;
        }
        else if(unit<=250)
        {
            amt = unit*1.2;
        }
        else
        {
            amt = unit*1.50;
        }

        surcharge = amt*0.2;
        bill_amt = amt+surcharge;
        System.out.println("Total Electricity Bill : "+bill_amt);
    }
}
