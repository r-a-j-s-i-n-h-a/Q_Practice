/*Lecture-7
Problem 1 (Interfaces):
Create an interface called Car with two abstract methods String getName() and int getMaxSpeed().
Also declare one default method void applyBreak() which has the code snippet
System.out.println(“Applying break on”+ getName());
In the same interface include a static method Car getFastestCar(Car car1, Car car2),
which returns car1 if the maxSpeed of car1 is greater than or equal to that of car2, else
should return car2.
Create a class called BMW which implements the interface Car and provides the implementation
for the abstract methods getName() and getMaxSpeed() (make sure to declare the appropriate
fields to store name and maxSpeed and also the constructor to initialize them).
Similarly, create a class called Audi which implements the interface Car and provides the
implementation for the abstract methods getName() and getMaxSpeed() (make sure to declare
the appropriate fields to store name and maxSpeed and also the constructor to initialize them).
Create a public class called MainApp with the below code in its main() method.
public static void main(String args[])
{
Car car1 = new BMW(“BMW X5”, 320);
Car car2 = new BMW(“AUDI Q7”, 300);
System.out.println(“fastest car is :”+ Car.getFastestCar(car1,car2).getName());
}*/

public interface Car {
    abstract String getName();
    abstract int getMaxSpeed();
    public void applyBreak();
    static void Car_getFastestCar(Car car1 , Car car2){
        if (car1.getMaxSpeed() >= car2.getMaxSpeed()){
            System.out.println("car2");
                   }
        else
        {
            System.out.println("car2");
        }
    }
}

 class BMW implements Car{
    String model_name;
    int bmw_speed;
    BMW(String name ,int speed){
        model_name=name;
        bmw_speed=speed;
    }
    @Override
     public String getName() {
         return model_name;
     }
     @Override
     public int getMaxSpeed() {
         return bmw_speed;
     }
     @Override
     public void applyBreak() {
         System.out.println("Applying break on"+ getName());
     }
 }

class audi implements Car {
    String model_name;
    int audi_speed;

    audi(String name, int speed) {
        model_name = name;
        audi_speed = speed;
    }

    @Override
    public String getName() {
        return model_name;
    }

    @Override
    public int getMaxSpeed() {
        return audi_speed;
    }

    @Override
    public void applyBreak() {
        System.out.println("Applying break on" + getName());
    }

//}

   // public class main {
    public static void main(String[] args) {
        Car car1 = new BMW("BMW X", 345);
        Car car2 = new audi("audi Y", 450);
       // System.out.println("fastest car is :"+ Car.Car_getFastestCar(car1,car2));
    }
}
