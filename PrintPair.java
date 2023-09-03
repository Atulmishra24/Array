// Time complexity : O(n^2);
// space complexity : O(1)

public class PrintPair{
    public static void printPair(int [] num ){
        int tp = 0;
        for(int i = 0 ; i < num.length ; i++){
            for(int j = i+1 ; j<num.length ; j++){
                System.out.print("( "+ num[i] + "," + num[j] + " )");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total number of pair are : "+ tp);       
    } 
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        printPair(num);
    }
}