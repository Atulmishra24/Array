
import java.util.*;
public class sellingProfit{


    public static int optimumBuyAndSell(int [] arr){
        int buyingPrice = Integer.MAX_VALUE;//Track Lowest Buying price 
        int maxPrice = 0;

        for(int i = 0 ; i<arr.length;i++){
           if(buyingPrice<arr[i]){
            int profit = arr[i]-buyingPrice;
            maxPrice = Math.max(maxPrice,profit);
           }
           else{
            buyingPrice = arr[i];
           }

        }
        return maxPrice;

    }

    public static int bruteForceBuyAndSell(int [] arr){

        // {7,1,5,3,6,4}
        int maxprofit = 0; 
        for(int i =0;i < arr.length;i++){
            int max = Integer.MIN_VALUE;
            for(int j = i+1 ; j <arr.length;j++ ){
               if(max<arr[j]){
                max=arr[j];
               }
            }
              int profit = max-arr[i];
              if(profit>maxprofit){
                maxprofit=profit;
              }
          }
          return maxprofit;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
     int result1  =   bruteForceBuyAndSell(arr);
     int result2 = optimumBuyAndSell(arr);
     System.out.println(result1);
     System.out.println(result2);
    }
}