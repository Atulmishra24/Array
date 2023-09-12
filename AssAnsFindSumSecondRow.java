public class AssAnsFindSumSecondRow{
    public static void findSum(int arr[] []){
         int sum =0;

            for(int j =0 ; j < arr[0].length ;j++){
             
                    sum+=arr[1][j];


            }
            System.out.println("The Sum of 2 nd Row Number is : "+ sum);
         }

    }
    public static void main(String[] args) {
        int arr [][]= {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };

        findSum(arr);
    }
}