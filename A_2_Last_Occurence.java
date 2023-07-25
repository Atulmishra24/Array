import java.util.*;
public class A_2_Last_Occurence {
     public static int LastOccurence(int arr[] ,  int x){
        int low = 0 , high = arr.length-1 , result = -1;
            while(low<=high){
                int mid= low+(high-low)/2;
                if(arr[mid]==x){
                    result = mid;
                    low=mid+1;
                }
                else if (arr[mid]>x){
                    high=mid-1;
                }
                else{
                    low = mid+1;
                }
            }
      return  result;
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

        //User Input for entering target element for searching
        System.out.println("Enter The Number that you want to search in array :)");
        int targetElement = sc.nextInt();
        //FUnction Call
        int result = LastOccurence(arr, targetElement);
        if(result!=-1){
            System.out.println("The element which you want to target is last occurs at :) "+ result);
        }
       
        else{
            System.out.println("Element not found in the given Array :) ");
        }
    }
}
