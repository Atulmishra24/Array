import java.util.*;
  

public class A_3_Number_Total_BInary {
    public static int CountBinary(int [] arr){
        int low = 0 , high=arr.length-1 , binary1Count = 0;
         
        while(low<=high){
           int mid = low+(high-low)/2;
           if(arr[mid]==1){
            binary1Count += ((high-mid)+1);
            high=mid-1;
        } else {
            low=mid+1;
        }
       }
       return binary1Count;
    }
      
    

public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
   //Useer Input for array generation
   System.out.println("Enter The Number How Many Number you Want to add in the array :) ");
   int n = sc.nextInt();
   int arr[] = new int[n];


   //User Input for adding element in the array 

   System.out.println("Enter the Element which you want to add in the array :)");
   for (int i = 0; i < n; i++) {
       arr[i] = sc.nextInt();
   }



   //Function Calling
   int result = CountBinary(arr);
   System.out.println("Number of 1 in array is : "+ result);
   }    
}
