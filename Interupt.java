class interupt extends Thread{
    public void run(){

            try {
                for(int i = 0 ; i<=10 ; i++ ){
                    System.out.println(i);
                    Thread.sleep(1000);
            }


        } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}class demo1 {
    public static void main(String args[]){
        interupt obj = new interupt();
        obj.start();
        obj.interrupt();



    }
}
