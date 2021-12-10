import java.util.*;
import java.lang.*; 
class ReturnMax 
{       
    static int largest(int []arr, int n) 
    { 
        Arrays.sort(arr); 
        return arr[n - 1]; 
    }
    public static void main (String[] args) 
    {    
        Scanner s = new Scanner(System.in);
        System.out.print("How many elements do you want to input? ");
        int n, m;
        n = s.nextInt(); 
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0; i<n; i++){
            m = s.nextInt();
            arr[i] = m;
        }
        System.out.println("largest element is " + largest(arr , n)); 
    }
}
