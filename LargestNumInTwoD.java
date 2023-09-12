import java.util.*;

public class LargestNumInTwoD{
    public static void searchLargestAndSmallest(int [][] arr){
           int max = Integer.MIN_VALUE;
           int min = Integer.MAX_VALUE;


           for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length; j++){
               if(arr[i][j] > max) {
                max=arr[i][j];
               }
               if(arr[i][j]< min){
                min = arr[i][j];
               }
            }
           }

           System.out.println(max);
           System.out.println(min);



    }
    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length ; i++){
            for(int j =0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        searchLargestAndSmallest(arr);
    }
}