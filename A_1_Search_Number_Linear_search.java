import java.util.Scanner;

public class A_1_Search_Number_Linear_search {
    public static int LinearSearch(int arr[] , int x){
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                result=i;
                break;
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

        System.out.println("Enter the Element which you want to add in the array :)");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //User Input for entering target element for searching
        System.out.println("Enter The Number that you want to search in array :)");
        int targetElement = sc.nextInt();
        
        //function Call 
        int result = LinearSearch(arr,targetElement);
        if(result!=-1){
            System.out.println("The element which you want to target is at :) "+ result);
        }
        else{
            System.out.println("Element not found in the given Array :) ");
        }
    }
}
