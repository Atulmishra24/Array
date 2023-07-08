public class OneDArrayPrefixSu {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5};
        for (int i = 1; i < arr.length; i++) {
            arr[i]=arr[i]+arr[i-1];
        }
        //    int[] prefixSum =  new int[arr.length];
        // for (int i = 1; i < prefixSum.length; i++) {
        //     prefixSum[i] = arr[i]+prefixSum[i-1];
        // }   
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
