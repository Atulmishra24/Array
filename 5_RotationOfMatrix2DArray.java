import java.util.*;
import java.io.*;


public class RotationOfMatrix2DArray {
   public static void RotateMatrix(int [] [] arr){
        int m = arr.length;
        int n = arr[0].length;
    //Transpose of Matrix
    for (int i = 0; i < m; i++) {
        for (int j = i; j < n; j++) {
           
            int temp = arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i] = temp;
        }

        // swap first and Last column
        
        int li=0,ri=n-1;
        while (li<ri) {
            int temp = arr[i][li];
            arr[i][li]= arr[i][ri];
            arr[i][ri]=temp;
            li++;
            ri--;
        }
    }
   }
    public static void main(String[] args) {
        int [] [] arr = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        RotateMatrix(arr);
        System.out.println("The Rotated Matrix is : \n");
        for (int[] is : arr) {
            System.out.println( Arrays.toString(is));
        }
    }
}
