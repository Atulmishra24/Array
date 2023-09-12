public class SpiralTwoDMatrix{

    public static void printSpiral(int [][] arr){
          int startRow =0 , startColn =0, endRow = arr.length-1, endColn =arr[0].length-1;
            while(startRow<=endRow && startColn<=endColn){
                //top 
                for(int j = startColn ; j<= endColn ; j++){
                    System.out.print(arr[startRow][j]+" ");
                }

                //right
                for(int i = startRow+1 ; i<= endRow ; i++){
                    System.out.print(arr[i][endColn]+" ");
                }

                //Bottom

                for(int j = endColn-1; j >= startColn ; j--){

                    if(startRow==endRow){
                        break;
                    }
                    System.out.print(arr[endRow][j]+" ");
                }

                //left 

                for(int i = endRow-1; i>= startRow + 1 ; i--){
                    if(startColn==endColn){
                        break;
                    }
                    System.out.print(arr[i][startColn]+" ");
                }
                startRow++;
                startColn++;
                endColn--;
                endRow--;
            }
            System.out.println();
        }


    public static void main(String[] args) {
        int arr [][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    }
    };
    printSpiral(arr);
}