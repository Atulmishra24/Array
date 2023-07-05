public class StringPalindrome {
public static void main(String[] args) {
    String s = "MoOM";
    int n=s.length();
    int flag = 0;
    for (int i = 0; i < n; i++) {
        if(s.charAt(i)!=s.charAt(n-i-1)){
          flag++;
          System.out.println("Not a palindrome");
          break;
          
        }
    }
    if(flag==0){
        System.out.println("Palindrome");
    }
}    
}
