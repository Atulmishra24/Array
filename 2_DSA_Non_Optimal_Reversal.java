public class DSA_2_Non_Optimal_Reversal {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};
        int copy[]= new  int[arr.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i]=arr[arr.length-i-1];
        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+" ");
        }
        System.out.println();
     }
}
