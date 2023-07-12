import java.util.Scanner;

public class LinearSearching {
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
        // searching of Array element
        int idx =-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==targetElement){

              idx=i;
              break;
        }
        }

        // output for user 

        if(idx == -1){
            System.out.println("The Enter Target element is not Present in the Given Array");
                }
                else{
                    System.out.println("Target Element is Present at index : "+idx);
                }
    }
}
