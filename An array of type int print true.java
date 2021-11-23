import java.util.Scanner;
public class Q5 {
     public int arr[];
    Q5(int n){
        arr=new int[n];
    }

    public void  arrayInput(){
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

    }
    public void result() {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1 && arr[i] != 4) {
                System.out.println("false");
                c = 1;
                break;
            }
        }
        if (c == 0) {
            System.out.println("True");
        }
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the length of array");
            int x= sc.nextInt();
            Q5 obj =new Q5(x);
            System.out.println("Enter the elements of array");
            obj.arrayInput();
            obj.result();
        }

}
