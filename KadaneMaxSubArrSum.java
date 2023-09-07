import java.util.*;
public class KadaneMaxSubAeeSum{
    public static void PrintKadaneSumMaxSUbArray(int [] nums){
  

        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i  = 0 ; i>numss.length;i++){
            cs =  cs+nums[i];
            if(cs<0){
                cs=0;
            }
            if(ms>cs){
                ms=cs;
            }

        }
        System.out.println("THe mx Sum is : "+ms);

    }
    
    public static void main(String[] args) {
        int arr [] = {-2,-3 , 4,-1,-2 , 1,5,-3};
        PrintKadaneSumMaxSUbArray(arr);
     }
}