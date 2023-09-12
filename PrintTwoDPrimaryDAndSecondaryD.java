public class PrintTwoDPrimaryDAndSecondaryD{


    public static void findBruteForcePDandSD(int arr [][]){
         int sum=0;
         for(int i =0 ; i < arr.length;i++){
            for(int j = 0 ; j < arr[0].length; j++){
                if(i==j){
                    sum+=arr[i][j];
                }
                if(i+j==n-1)
                {
                      sum +=arr[i][j];
                }
            }
         }


    }
    public static void findOptimalPDandSd(int arr[][]){
           int sum = 0;
           for(int i = 0 ; i<arr.length; i++){
              sum+=arr[i][i];
              if(i!=arr.length-i-1){
                sum+=arr[i][arr.length-1-i];
              }

           }

    }
    public static void main(String[] args) {
        int arr [][] = {
             {1,2,3,4},
             {5,6,7,8},
             {9,10,11,12},
             {13,14,15,16}
        };

        findBruteForcePDandSD(arr);
        findOptimalPDandSd(arr);
    }
}
