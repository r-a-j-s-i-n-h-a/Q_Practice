/*
4) Write a program to create a class named shape. It should contain 2 methods
- draw() and erase() which should print “Drawing Shape” and “Erasing Shape” respectively.
For this class we have three sub classes- Circle, Triangle and Square and each class
 override the parent class functions- draw () and erase ().
The draw() method should print “Drawing Circle”, “Drawing Triangle”, “Drawing Square”
 respectively.
The erase() method should print “Erasing Circle”, “Erasing Triangle”, “Erasing Square”
 respectively.
Create objects of Circle, Triangle and Square in the following way and observe the
polymorphic nature of the class by calling draw() and erase() method using each object.
Shape c=new Circle();
Shape t=new Triangle();
Shape s=new Square();*/


public class shape {
    public void draw() {
        System.out.println("Drawing Shape");
    }

    public void ease() {
        System.out.println("Erasing Shape");
    }
}
class Circle extends shape{
        public void draw(){
            System.out.println("Drawing Circle");
        }
        public void ease(){
            System.out.println("Erasing erase");
        }
    }
    class triangle extends shape{
        public void draw(){
            System.out.println("Drawing triangle");
        }
        public void ease(){
            System.out.println("Erasing triangle");
        }
    }

    class Square extends shape{
        public void draw(){
            System.out.println("Drawing Square");
        }
        public void ease(){
            System.out.println("Erasing Square");
        }
    }
class Test{
    public static void main(String[] args) {
        shape c=new Circle();
        shape t=new triangle();
        shape s=new Square();
        c.draw();

    }
}
