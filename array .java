/*Q10. Create an int array of size 5, initialize it with values(10,20,30,40,50).
 Create a public boolean search(int arr[], int search_element) this method will
 return true if the search element is present in the array else it will  print a
 message "element not found"*/

import java.util.Scanner;
public class array_search {
    int arr[];
    int element;
     array_search(){
        arr = new int[5];
    }

    public static boolean search(int arr[] , int element) {
        boolean result=false;
        for (int i = 0; i < 5; i++) {

            if (arr[i] == element) {
                result = true;
            }
        }
return result;
    }

    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a element to be search in array - ");
        int element = sc.nextInt();
        array_search obj = new array_search();
        boolean result =obj.search(arr,  element);
        if (result== true){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
    }

}
