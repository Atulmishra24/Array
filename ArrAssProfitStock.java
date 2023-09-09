import java.util.*;

public class ArrAssProfitStock{

    public static int findProfit(int [] prices){
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0 ;
        for(int i = 0 ; i < prices.length; i++){
            int sellingPrice= arr[i];
            if(buyPrice <= sellingPrice){
                int profit = sellingPrice - buyPrice;
                MaxProfit = Math.max(MaxProfit,profit);
            }
            else{
                buyPrice = sellingPrice;
            }

        }
        return MaxProfit;


    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int profit = findProfit(prices);
        System.out.println(profit); 
    }
}