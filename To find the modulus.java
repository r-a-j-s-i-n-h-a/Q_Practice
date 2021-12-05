import java.util.*;

class solution{
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int T =  sc.nextInt();
        while(T-->0){
            int[] arr= new int[2];
        
            for(int i=0;i<2;i++)
                arr[i]=sc.nextInt();
            System.out.println(arr[0]%arr[1]);
        } 
    }
}
