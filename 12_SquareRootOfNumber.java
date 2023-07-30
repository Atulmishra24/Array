import java.util.Scanner;

public class SquareRootOfNumber {
    
    public static int findSquareRoot(int num){
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
        System.out.println("Enter The number For which you want Square Roots");
        int n = sc.nextInt();
        int result = findSquareRoot(n);
        System.out.println("The Square root of the number is : "+ result);
    }
}
