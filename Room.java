import jdk.jshell.Snippet;

import java.util.Scanner;

public class Room {
    boolean AC_ON, HOME_THEATRE_ON, FAN_ON, LIGHT_ON;

    Room(boolean AC_ON, Boolean HOME_THEATRE_ON, Boolean FAN_ON, Boolean LIGHT_ON){
        this.AC_ON=AC_ON;
        this.HOME_THEATRE_ON=HOME_THEATRE_ON;
        this.FAN_ON=FAN_ON;
        this.LIGHT_ON=LIGHT_ON;

    }



    public void Display(){
        int sum=0;
        if(AC_ON==true){
            sum=sum+1200;
        }
        if(HOME_THEATRE_ON==true){
            sum=sum+600;
        }
        if(FAN_ON==true){
            sum=sum+400;
        }
        if(LIGHT_ON==true){
            sum=sum+100;
        }
        if(sum>2000){
            System.out.println("overloaded");
        }
        else{
            System.out.println( "Amount of Electricity Consumed :"+sum);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter true for switch on otherwise false");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Switch AC");
        boolean a=sc.nextBoolean();
        System.out.println("Enter Switch Home theatre");
        boolean b=sc.nextBoolean();
        System.out.println("Enter Switch Fan");
        boolean c=sc.nextBoolean();
        System.out.println("Enter Switch Light ");
        boolean d=sc.nextBoolean();
        Room obj=new Room(a,b,c,d);
        obj.Display();

    }
}
