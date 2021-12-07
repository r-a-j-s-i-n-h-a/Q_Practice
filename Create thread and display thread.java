   // Create two threads and assign names "Scooby" and "Shaggy" to the two threads . Display both threads names
   
   
   
   class Scooby extends Thread {
        public void run() {
            Thread.currentThread().setName("Scooby");
            System.out.println("The name of thread is: " + Thread.currentThread().getName());

        }
    }
    class Shaggy extends Thread {
        public void run() {
            Thread.currentThread().setName("Shaggy");
            System.out.println("The name of thread is: " + Thread.currentThread().getName());

        }
    }
    public class Thread1 extends Thread {
        public static void main(String[] args) {

            Shaggy t = new Shaggy();
            t.start();

            Scooby t2=new Scooby();
            t2.start();


        }
    }




