import java.util.Scanner;

public class LowerBoundFirstOccurence {
    public static int findFirstOccurence(int[] arr , int x){
        int low = 0 , high = arr.length-1 , result = -1;
        while (low<=high) {
            //avoid overflow
            int mid = low + (high - low) / 2;
            if(arr[mid]==x){
                result = mid;
                high = mid-1;
            }
            else if(arr[mid]<x){
                low=mid+1;
            
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User Input for number of element of an array
        System.out.println("Enter the Number of element of an Array : ");
        int n = sc.nextInt();
        int arr [] = new int[n];

        // User Input for element of an array
        System.out.println("Enter the element of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        // User Input for Target element of an array
        System.out.println("Enter the target number of an array: ");
        int target = sc.nextInt();

        //Function call for find lower bound/first occurence
         int result = findFirstOccurence(arr,target);
         if(result==-1){
            System.out.println("Target Element not Found in an array: ");
         }
         else{
            System.out.println("First Occurence of Target Element is at index of : "+ result);
         }

    }
}
