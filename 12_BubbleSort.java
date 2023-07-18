import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
   public static void doBubbleSort(int [] arr){
    int n= arr.length;
    boolean swapped = false;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-1-i; j++) {
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swapped=true;
            }
        }

        if(swapped!=true){
            break;
        }
    }

   }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number of element of an Array : ");
       int n = sc.nextInt();
       int arr [] = new int[n];
   
       // User Input for element of an array
       System.out.println("Enter the element of an array: ");
       for (int i = 0; i < n; i++) {
           arr[i]=sc.nextInt();
       }

       //Do Bubble Sort 
       doBubbleSort(arr);
      System.out.println("Sorted Array is : "+Arrays.toString(arr));

    }
}
