import java.util.Scanner;
public class abc {
    int[][] arr;
    abc(String a[])
    {
        arr= new int [2][2];
        var k=0;
        for (var i = 0; i < 2; i++) {
            for (var j = 0; j < 2; j++) {
                arr[i][j]=Integer.parseInt(a[k++]);
            }
        }

    }

    public void reverse() {
        System.out.println("The given array is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
        System.out.println("The reverse array is :");
        for (int i = 1; i >=0; i--) {
            for (int j = 1; j >=0; j--)
                System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        if(args.length!=4)
            System.out.println("Please enter 4 integer numbers");
        else{
            abc obj=new abc(args);
            obj.reverse();
            }
        }
    }
