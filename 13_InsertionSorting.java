import java.util.Arrays;

public class InsertionSorting {
    public static void InsertionSort(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
           j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            
        }
    }
    public static void main(String[] args) {
        int [] arr ={3,1,2,7,6,14,5,11};
        InsertionSort(arr);
        System.out.println("The Sorted Araay is : "+ Arrays.toString(arr));
    }
}
