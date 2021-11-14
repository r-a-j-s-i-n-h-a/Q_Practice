import java.util.Scanner;
public abstract class Instrument {
    public abstract void play();

    class Piano{
        public void play(){
            System.out.println("Piano is playing tan tan tan tan");

        }

    }

    class Flute{
        public void play(){
            System.out.println("Flute is playing too too too");
        }

    }

    class Guitar{
        public void play(){
            System.out.println("Guitar is playing tin tin tin");
        }

    }

    public static void main(String[] args) {
       String Instrument[]=new String[10];
       Scanner sc = new Scanner(System.in);
       for (int i=0;i<=10;i++){
           System.out.println("Enter instrument name");
           String a = sc.nextLine();

           if(a.equals("Piano")) {
               System.out.println("Piano is playing tan tan tan tan");
           }
           if(a.equals("Flute"))  {
               System.out.println("Flute is playing too too too");
           }
           if(a.equals("Guitar")){
               System.out.println("Guitar is playing tin tin tin");
           }
           else{
               System.out.println("Instrument is not in list");
           }

       }




    }
}
