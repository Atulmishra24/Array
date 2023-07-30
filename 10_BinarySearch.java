import java.util.Scanner;
public class BinarySearch {
   public static int BinarySearchFunction(int[] arr,int x){
      int low = 0,high=arr.length;
      while (low<=high) {
        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if (arr[mid]>x){
            high=mid-1;
        }
        else{

            low=mid+1;
        }
        
      }
      return 0;
   }
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Taking user input for making array
         System.out.println("Enter The Number of Array Element :) ");
         int n = sc.nextInt();
          
         // making Array according to user input
         int [] arr = new int[n];
         //Storing vaules of Array element in array 
         System.out.println("Now Tell The Element of Array :) ");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
 
     //   user input for target element
     System.out.println("Enter the Target element :)");
     int targetElement = sc.nextInt();
      
    //function for binary search

    int result = BinarySearchFunction(arr, targetElement);



         // output for user 
 
         if(result == -1){
             System.out.println("The Enter Target element is not Present in the Given Array");
                 }
                 else{
                     System.out.println("Target Element is Present at index : "+ result);
                 }
    }
}
