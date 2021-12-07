//Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6.  ( Thread Control Mechanism concept)


class Print extends Thread{
    public void run(){
        Print t=new Print();
        for (int i=0;i<=10;i++){
            System.out.println(i);
            if(i==5){

                          try 
                           {
                              t.sleep(5000);
                              }
                          catch (InterruptedException e) 
                          {
                              e.printStackTrace();
                              }
                    
            }
        }
    }
}
public class ThreadQ2 extends Thread {
    public static void main(String[] args) {
        Print t=new Print();
        t.start();
    }
    }

