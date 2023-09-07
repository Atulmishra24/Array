public class largestNumber{

    public static int largestNumberArr(int [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {13,3,4,2,3,2};
         int result  = largestNumberArr(arr);
         System.out.println("The largest number in the array is "+ result);
    }
}