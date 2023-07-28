import java.util.*;
public class A_6_Reserved_Bubble_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array:");
        int x = sc.nextInt();

        int [] arr = new int[x];

        System.out.println("Enter the Element which you want to add in the array:)");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        
        //APply Buuble SOrt
       
        boolean swapped = false;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
    
            if(swapped!=true){
                break;
            }
        }
        System.out.println("Sorted Array is : "+ Arrays.toString(arr));
}}
