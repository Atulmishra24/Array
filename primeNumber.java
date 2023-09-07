public class aLLpRIMEpROBLEM{
    public static boolean notOptimalPrime(int n){
        if(n==2){
           return true;
        }

        for(int i =2 ; i<n;i++){
            if(n%i==0){
                return false;
            }

        }
    return true;
    }
    

    public static boolean optimizedPrime(int n){
        if(n==2){
            return true;
         }
 
         for(int i =2 ; i<=Math.sqrt(n);i++){
             if(n%i==0){
                 return false;
             }
 
         }
     return true;

    }

    public static void rangePrime(int start , int end){

        for(int i = start ; i<=end ; i++){
            if(optimizedPrime(i)){
                System.out.println(i+ " is Prime");
            }
            else{
                System.out.println(i + "  X not a prime ")
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(notOptimalPrime(3));
        System.out.println(optimizedPrime(234);
        rangePrime(2,5)
    }
}