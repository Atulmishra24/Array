public class A_Sum_Even_Index {
    public static void main(String[] args) {
        
       int arr [] = {3,20,4,6,9};
       //Non Optimum approach 
    //    int sum = 0; 
    //    for (int i = 0; i < arr.length; i++) {
    //     if(i%2==0){
    //         sum+=arr[i];
    //     }
    //    }
    //    System.out.println(sum);

        int i = 0 , sum = 0;
        while(i<arr.length){
            sum+=arr[i];
            i+=2;
        }
        System.out.println(sum);
    }
}
