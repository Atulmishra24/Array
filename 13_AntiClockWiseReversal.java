import java.util.*;
public class AntiClockWiseReversal {
    public static void RotateMatrix(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
    //Transpose of Matrix
    for (int i = 0; i < m; i++) {
        for (int j = i; j < n; j++) {
           
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i] = temp;
        }

        // swap first and Last ROW
        
        int li=0,ri=n-1;
        while (li<ri) {
            int temp = arr[li][i];
            arr[li][i]= arr[ri][i];
            arr[ri][i]=temp;
            li++;
            ri--;
        }
    }
    }
 
    public static void main(String[] args) {
        int arr [][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        RotateMatrix(arr);
        System.out.println("The Rotated Matrix is : \n");
        for (int[] is : arr) {
            System.out.println( Arrays.toString(is));
        }
    }
}
