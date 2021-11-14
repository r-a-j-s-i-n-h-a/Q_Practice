import java.util.Scanner;

/*
Create a base class Fruit which has name, taste and size as its attributes. A method called eat() is created
which describes the name of the fruit and its taste.  Inherit the same in 2 other classes Apple and
Orange and override the eat() method to represent each fruit taste.

 */
public class Fruit {
    String name;
    String taste;
    int size;

    Scanner sc = new Scanner(System.in);


    public Fruit() {
       name = sc.nextLine();
    }



    public void eat(){

        System.out.println("Name:" + name );
        System.out.println("taste:"+ taste);
    }

}


class Apple extends Fruit{
    Fruit obj1=new Fruit();
    Apple(String name , String taste,int size){
        taste="Sweet";
    }
    @Override
    public void eat() {
        super.eat();
    }
}


class Orange extends Fruit{
    Orange(String name,String taste,int size){
        this.taste="sour";


    }

    @Override
    public void eat(){
        super.eat();
    }
}
class Main {
    public static void main(String[] args) {

        Apple obj = new Apple("Apple","sweet",2);
        obj.eat();
      //same for Orange too


    }
}
