public class AssAnsPrintTransposeOfMatrix{

    public static void printTranspose(int arr [][]){
        int TransArr [][] = new int [arr[0].length][arr.length];  
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j < arr[0].length ; j++){
               TransArr [j][i] = arr[i][j];
            }
        }


        for(int i = 0 ; i<TransArr.length ; i++){
            for(int j = 0 ; j < TransArr[0].length ; j++){

                   System.out.print(TransArr[i][j]+" ");

            }
        }
    }
    public static void main(String[] args) {
        int arr [][] = {

            {2,1,34,5},
            {67,2,5,3}
        } ;

        printTranspose(arr);
    }
}