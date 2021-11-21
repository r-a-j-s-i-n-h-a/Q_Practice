/* Q2. At GLA College of  Programming, the final school fees to be paid is calculated as follows.
• Original Fees should be greater than or equal to R50 000
• Minimum fixed deposit of R10 000
• If a deposit is greater than equal to half the original fees, you get a 5%
 discount from the original fees
• Final total fees will also include the following
1. School Levy is 10% of original fees
2. Sports fee is 5% of the original fees.
Write a program the calculates the final total fees to be paid.
Program must request user to enter original fees value greater then R50 000.
Program should also request user to enter amount to deposit before calculating
final total fees.*/

import java.util.Scanner;

public class GLA {
    long O_fees;
    long D_fees,Discounted_fees;
    long discount;
    long F_fees;
    long Levy,Sport_fee;


    void show()
    {
        if(D_fees>=(O_fees/2))
        {
            discount= (O_fees*5)/100;
            Levy=(O_fees*10)/100;
            Sport_fee=(O_fees*5/100);
            Discounted_fees=O_fees-discount;
            F_fees=Levy+Sport_fee+Discounted_fees;
            System.out.println("The final fees to be submitted will be:"+ F_fees);


        }
        else{
            Levy=(O_fees*10)/100;
            Sport_fee=(O_fees*5/100);
            F_fees=Levy+Sport_fee+D_fees;
            System.out.println("The final fees to be submitted will be:"+ F_fees);

        }

    }
}

class Main{
    public static void main(String[] args) {
        GLA obj=new GLA();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter original fees should be greater than 50000");
        obj.O_fees=sc.nextLong();
        System.out.println("Enter deposit fees");
        obj.D_fees= sc.nextLong();

        obj.show();
    }
}
