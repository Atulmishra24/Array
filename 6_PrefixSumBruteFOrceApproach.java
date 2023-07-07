import java.util.Scanner;

public class PrefixSumBruteFOrceApproach {
    public static int findPrefixSum( int arr[][] , int r1 , int c1,int r2 ,int c2){
       int sum = 0;
       for (int index = r1; index <= r2; index++) {
        for (int i = c1; i < c2; i++) {
            sum+=arr[index][i];
        }
       }
       return sum ; 
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number of rows");
        int m = sc.nextInt();
        System.out.println("Enter The Number of Column");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];
        System.out.println("Now Enter the Values of Martices");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = sc.nextInt();
                arr[i][j] = value;
            }
        }

        System.out.println("enter the value of starting row value r1 ");
        int r1=sc.nextInt();
        System.out.println("enter the value of starting column value c1 ");
        int c1 = sc.nextInt();
        System.out.println("enter the value of ending row value r2 ");
        int r2 = sc.nextInt();
        System.out.println("enter the value of ending column value c1 ");
        int c2 = sc.nextInt();

       int prefixSum = findPrefixSum(arr , r1,c1,r2,c2);
       System.out.println("The Prefix Sum is : "+prefixSum);
}


}