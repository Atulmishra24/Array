import java.util.*;

public class PrintMaxMinSubArraySum{
    public static void printMaxMinSumSubarray(int [] numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < numbers.length ; i++){
         int start  = i ;
         for(int j =i ; j < numbers.length ; j++ ){
             int end =j ; 
             int sum = 0;
              for(int k = start ; k <= end ; k++ ){
              sum = sum+numbers[k];
            }
            if(max<sum){
                max = sum;                 
            }
            if(min>sum){
              min=sum;
            }
            System.out.println();
        }
        System.out.println();
    }
    System.out.println("maxmum value "+ max);
   System.out.println("minimum value "+ min);
     System.out.println();
 
     }
 
   
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        printMaxMinSumSubarray(numbers) ;    
    }
}