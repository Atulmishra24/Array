import java.util.*;


public class PrefixSumMaxSubAraay{
    public static void PSMA(int [] nums){
        int max = Integer.MIN_VALUE;
        int PrefixSum [] = new int [nums.length];
        PrefixSum[0] = nums[0]; 
        for(int i=1;i<nums.length; i++){
           PrefixSum[i] = PrefixSum[i-1]+nums[i];
         }


        for(int i = 0 ; i<nums.length; i++){
            int start = i;
            for(int j=i; j<nums.length;j++){
                int end = j ; 
                int curentSum = 0; 
               if(start==0){
                curentSum=PrefixSum[end];
               }
               else{
                curentSum = PrefixSum[end]-PrefixSum[start-1];
               }
               if(curentSum>max){
                   max=curentSum;
               }
           
            }
        }
        System.out.println("the max Sum is : "+ max);
        
    }
    
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        PSMA(numbers) ;  
    }
}