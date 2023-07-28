import java.util.Arrays;
import java.util.*;
public class A_7_Reverse_Selection_Sort {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of an Array:");
        int x = sc.nextInt();

        int [] arr = new int[x];

        System.out.println("Enter the Element which you want to add in the array:)");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            int maxidx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[maxidx]< arr[j]){
                    maxidx=j;
                }
            }
            if(maxidx!=i){
                int temp = arr[maxidx];
                arr[maxidx]=arr[i];
                arr[i]=temp;
            }            
        }

System.out.println(" Reversed Sorted Array is : "+ Arrays.toString(arr));
    }


}
