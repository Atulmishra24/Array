import java.util.*;
public class reverseOfArray{

    public static int[] findReverse(int [] arr){
       int n = arr.length;
        for(int i = 0 ; i<n/2; i++){
           int temp = arr[i];
           arr[i]= arr[n-i-1];
           arr[n-i-1]= temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr [] = {21,3,22,3,23,9};
        System.out.println(Arrays.toString(findReverse(arr)));
    }
}