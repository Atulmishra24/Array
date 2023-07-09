import java.util.*;
import java.io.*;
public class A_Largest_Number {
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

        int largestNumber = 0 ; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]>largestNumber){
                    largestNumber=arr[i][j];
                }
            }
        }
        System.out.println("THe largest Number is : "+ largestNumber);
    }
}
