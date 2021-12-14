import java.util.Scanner;

public class Q2 extends Exception
{
        public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            try
            {
                System.out.println("Enter the Number of elements in the array");
                int a = s.nextInt();
                int arr[] = new int[a];

                System.out.println("Enter the elements in the array");
                for (var i=0;i< arr.length;i++)
                {
                    arr[i] = s.nextInt();
                }

                System.out.println("Enter the element of the array that you want to access");
                int index = s.nextInt();

                System.out.println("Array element at the index "+index+" = "+arr[index]);
                System.out.println("The array element successfully accessed");

                System.out.println("End of program.");
            } catch (Exception obj)
            {
                System.out.println(obj);
                /*
                       we can also use these commmond to print msg
                System.out.println(obj.getMessage());
                System.out.println(obj.toString());
                obj.printStackTrace();
                */
            }
        }
        }
