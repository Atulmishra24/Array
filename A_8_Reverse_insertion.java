import java.util.*;
public class A_8_Reverse_insertion {
     public static void reverseInsertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int j = i ;
            while(j>0 && arr[j-1]<arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array:");
        int x = sc.nextInt();

        int [] arr = new int[x];

        System.out.println("Enter the Element which you want to add in the array:)");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        reverseInsertionSort(arr);
        System.out.println("Reverse Sorted Array is : "+ Arrays.toString(arr));
        
    }
}
