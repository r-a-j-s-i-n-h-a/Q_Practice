/*
1. Create an interface LibraryUser with the following methods declared,
Method Name-
registerAccount
requestBook
2. Create 2 classes “KidUsers” and “AdultUser” which implements the LibraryUser interface.

3.  Both the classes should have two instance variables as specified below.
Instance variables  Data type
age int
bookType String



4. The methods in the KidUser class should perform the following logic.
registerAccount function:
if age < 12, a message displaying “You have successfully registered under a Kids Account” should be displayed in the console.
If(age>12), a message displaying, “Sorry, Age must be less than 12 to register as a kid” should be displayed in the console.
requestBook function:
if bookType is “Kids”, a message displaying “Book Issued successfully, please return the book within 10 days” should be displayed in the console.
Else, a message displaying, “Oops, you are allowed to take only kids books” should be displayed in the console.
5. The methods in the AdultUser class should perform the following logic.

registerAccount  function:
if age > 12, a message displaying “You have successfully registered under an Adult Account” should be displayed in the console.
If age<12, a message displaying, “Sorry, Age must be greater than 12 to register as an adult” should be displayed in the console.
requestBook function:
if bookType is “Fiction”, a message displaying “Book Issued successfully, please return the book within 7 days” should be displayed in the console.
Else, a message displaying, “Oops, you are allowed to take only adult Fiction books” should be displayed in the console.
6. Create a class “LibraryInterfaceDemo.java” with a main method which performs the below functions,
Test case #1:
Create an instance of KidUser class.
Set the age as specified in the below table and invoke the registerAccount method  of the  KidUser object

Age
10
18

Set the book Type as specified in the below table and invoke the requestBook method of the KidUser object,

BookType
“Kids”
“Fiction”

Test case #2:

Create an instance of AdultUser class.
Set the age as specified in the below table and invoke the registerAccount method of the AdultUser object

Age
5
23

Set the book Type as specified in the below table and invoke the requestBook method of the  AdultUser  object
BookType
“Kids”
“Fiction”
*/






import java.awt.print.Book;
import java.util.Scanner;

 interface  LibraryUser {
    public  void registerAccount();
    public void requestBook();

}
class KidUsers implements LibraryUser {
    int age;
    String bookname;
    public  void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

        public void requestBook () {
            if (bookname.equals("Kids")) {
                System.out.println("Book Issued successfully, please return the book within 10 days");
            } else {
                System.out.println("Oops, you are allowed to take only kids books");
            }
        }

}
class AdultUser implements LibraryUser {
    int age;
    String bookname;

    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }

    }

    public void requestBook() {
        if (bookname.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}
class LibraryUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KidUsers obj1 = new KidUsers();

        System.out.println("Enter a registerAccount-");
        int age = sc.nextInt();

        System.out.println("enter a booktype-");
        String bookname = sc.next();

        obj1.registerAccount();
        obj1.requestBook();

    }

  }
