public class searchInTwoDMatrix{


     public static boolean findKeyInTwoDCaseOne(int arr[][] , int key){
         int row =0 ,colm = arr.length-1;
         while(row < arr.length && colm>=0){
            if(key == arr[row][colm]){
                System.out.println("The Element Found At ( "+ row +" , "+ colm +" )");
                 return true;
             }
            else if (key > arr[row][colm]){
                row++;
            }
            else{
                colm--;
            }
         }
         
         System.out.println("Not Found ::) ");
        return false;

     }
     public static boolean findKeyInTwoDCaseTwo(int arr[][] , int key){
         int row =arr.length-1 ,colm = 0;
         while(row >= 0 && colm < arr.length){
            if(key == arr[row][colm]){
                System.out.println("The Element Found At ( "+ row +" , "+ colm +" )");
                 return true;
             }
            else if (key > arr[row][colm]){
                colm++;
            }
            else{
                row--;
            }
         }
         
         System.out.println("Not Found ::) ");
        return false;

     }
    public static void main(String[] args) {
        int arr [][] = {
            {10,20,30,40},
            {15 ,25,35,45},
            {27,29,37,49},
            {32,33,39,50}
        };

        int key1 = 33;
        int key2 = 20;

        findKeyInTwoDCaseOne(arr,key1);
        findKeyInTwoDCaseTwo(arr,key2);
    }
}