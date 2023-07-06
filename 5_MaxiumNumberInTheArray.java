public class MaxiumNumberInTheArray {
    public static void main(String[] args) {
        int arr[]= {34,21,54,65,43};
         int max=0;
         for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
         }
         System.out.println(max);


         int[] arr1 = { 10, 7, -5, 8, 9, 0, -4 };
        int max1 = Integer.MIN_VALUE;
        for (int val : arr1) {
            max1 = Math.max(max1, val);
        }
        System.out.print("Largest in given array is " + max1+" ");
    }
}
