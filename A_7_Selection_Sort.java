import java.util.*;
public class A_7_Selection_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Useer Input for array generation
        System.out.println("Enter The Number How Many Number you Want to add in the array :) ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        //User Input for adding element in the array 

        System.out.println("Enter the Element which you want to add in the array:)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        

        for (int i = 0; i < n; i++) {
             int maxidx=i;
            for (int j = i+1; j < n-i-1; j++) {
                if(arr[j]>arr[maxidx]){
                   maxidx=j;
                }
            }

            if(arr[i]>arr[maxidx]){
                int temp = arr[i];
                arr[i]=arr[maxidx];
                arr[maxidx]=temp;
            }
        }

        System.out.println("Sorted Array is : "+ Arrays.toString(arr));
        
    }
}
