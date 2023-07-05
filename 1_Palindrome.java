class Palindrome {
    public static void main(String[] args) {
      int []  arr = {1,2,3,2,1,9};
      int n= arr.length;
      // find this array is palindrome or not 
      int copy [] = new int[n];
      for (int i = 0; i < arr.length; i++) {
          copy[i]= arr[n-i-1]; 
      } 
      int flag =0;
      for (int i = 0; i < copy.length; i++) {
        if(arr[i]!=copy[i]){
            flag++;
            break;
        }
      }
      if(flag>0){
        System.out.println("Not Palindrome");
      }
      else{
        System.out.println("Palindrome");
      }
    
    }
}