/*  Create an outer class with a function display, again create another class
 inside the outer class named inner with a function called display and call the
 two functions in the main class. */
 
 
 
 class outer {
      public void display(){
          System.out.println("this is a outer class");
    }
     class inner{
     void display2(){
            System.out.println("this is inner class");
        }
    }

    public static void main(String[] args) {
       outer obj = new outer();
        obj.display();
        outer.inner obj2 = obj.new inner();
        obj2.display2();

    }

}
