import java.util.*;
public class A_4_Duplicate_number_occurence {
   public static int firstOcuurence(int arr[], int x){
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
   public static int LastOccurence(int arr[], int x){
    int low = 0 , high = arr.length-1 , result = -1;
    while (low<=high) {
        //avoid overflow
        int mid = low + (high - low) / 2;
        if(arr[mid]==x){
            result = mid;
            low = mid+1;
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
        //Useer Input for array generation
        System.out.println("Enter The Number How Many Number you Want to add in the array :) ");
        int n = sc.nextInt();
        int arr[] = new int[n];


        //User Input for adding element in the array 

        System.out.println("Enter the Element which you want to add in the array:)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        

        //User Input for entering target element for searching
        System.out.println("Enter The Number that you want to search in array :)");
        int targetElement = sc.nextInt();
      int lowerBound = firstOcuurence(arr,targetElement);
     int lastBound =  LastOccurence(arr,targetElement);
     int count = lastBound-lowerBound+1;
     if(lastBound==-1 || lastBound ==-1){
      System.out.println("Element not found");  
     }
     else{
        System.out.println("The Number occurs : "+ count+" times");
     }
    
    }
}
