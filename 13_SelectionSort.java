import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
          int min_idx= i ;
          for (int j = i+1; j < arr.length; j++) {
            if(arr[min_idx]> arr[j]){
                min_idx=j;
            }
          }
          
          if(min_idx!=i){
            int temp = arr[i];
            arr[i]=arr[min_idx];
            arr[min_idx]=temp;
          }
        }

    }
    public static void main(String[] args) {
        int arr [] = {23,12,1,9,2,8,11};
        selectionSort(arr);
        System.out.println("Sorted Array is  : \n "+ Arrays.toString(arr));
    }
}
