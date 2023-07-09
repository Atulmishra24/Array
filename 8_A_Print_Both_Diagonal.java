import java.util.*;
import java.io.*;
public class A_Print_Both_Diagonal {
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
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j || i+j==m-1){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }

    }
}
