import java.util.Scanner;

public class Search {
    public int arr[];
    int search_element;
    Search(int search_element){
        this.search_element = search_element;
       int  arr[]={10,20,30,40,50};
    }
    public static boolean search(int arr[],int search_elements) {
        boolean result = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (search_elements)) {
                result = true;
            }



        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the key to found");
        int search_element = sc.nextInt();
        Search obj =new Search(search_element);
        int arr[]= {10,20,30,40,50};
        boolean result = obj.search(arr,search_element);
        if(result){
            System.out.println("Element found");
        }
        else
            System.out.println("Element Not Found");
    }
    }

