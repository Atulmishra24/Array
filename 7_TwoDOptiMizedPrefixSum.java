import java.util.*;
import java.io.*;
public class TwoDOptiMizedPrefixSum {
    public static void PrefixMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
      //row wise Prefix Addition
        for (int i = 0; i < m; i++) {
            for (int j = 1; j <n; j++) {
                arr[i][j]+=arr[i][j-1];

            }
        }
        //Colmn Addition 
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < arr.length; i++) {
                arr[i][j]+=arr[i-1][j];
            }
        }
    }

    public static int findResult(int arr[][], int r1,int c1, int r2, int c2){
      int result =0;
      int whole = 0 , up = 0 , left = 0 , repeated =0 ;
      
      whole = arr[r2][c2];
      up = arr[r1-1][c2];
      left = arr[r2][c1-1];
      repeated = arr[r1-1][c1-1];
      result = whole-up-left+repeated;
      return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of rows");
        int m = sc.nextInt();
        System.out.println("Enter The Number of Column");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Now Enter the Values of Martices");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = sc.nextInt();
                arr[i][j] = value;
            }
        }

        System.out.println("enter the value of starting row value r1 ");
        int r1=sc.nextInt();
        System.out.println("enter the value of starting column value c1 ");
        int c1 = sc.nextInt();
        System.out.println("enter the value of ending row value r2 ");
        int r2 = sc.nextInt();
        System.out.println("enter the value of ending column value c1 ");
        int c2 = sc.nextInt();
     PrefixMatrix(arr);
     int result = findResult(arr , r1, c1 , r2,c2);
     System.out.println("The prefix sum result is : "+ result);
        
    }
    
}
