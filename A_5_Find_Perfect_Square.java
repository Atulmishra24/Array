import java.util.Scanner;

public class A_5_Find_Perfect_Square {
public static int findPerfectSquare(int num) {
    int low = 0 , high = num,result=-1;
        while(low<=high){
           int mid = low+(high-low)/2;
           long var = mid*mid;
           if(var==num){
            return mid;
           }
           else if(var<num){
            result=mid;
            low=mid+1;
           
           }
           else{
            high= mid-1;
           }
        } 
        return result;

    }
   


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Number: ");
       int number = sc.nextInt();
      int result = findPerfectSquare(number);
     if((result*result)==number){
        System.out.println(true+" , yes it is Perfect Square");
     }
    else{
        System.out.println(false+" , No it's not Perfect Square");
    }
    }
}
