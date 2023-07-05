public class OptimiziedPalindrome {
  public static void main(String[] args) {
    
    int []  arr = {1,2,3,2,1,2};
    int n= arr.length;
     int flag = 0;
    for (int i = 0; i < arr.length; i++) {
    if(arr[i]!=arr[n-i-1]){
    
        System.out.println("Not Palindrome");    
        flag++;
        break;
    }        
    }

    if(flag==0){
        System.out.println("Palindrome");
    }
  }   
}
