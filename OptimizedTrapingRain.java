public class OptimizedTrapingRain{

    public static int findTrapWater(int arr[]){
        int n = arr.length;
        int trapWater = 0 , leftIndex = 0 ; rightIndex = n-1;
        int lWaterMax = arr[leftIndex],rWaterMax = arr[rightIndex];
        
        while(leftIndex<rightIndex){

            if(lMax<rMax){
                leftIndex++;
                lWaterMax= Math.max(lWaterMax,arr[leftIndex]);
                trapWater+= lWaterMax-arr[leftIndex];
            }
            else{
                rightIndex--;
                rWaterMax= Math.max(rWaterMax,arr[rightIndex]);
                trapWater+= rWaterMax-arr[rightIndex];             
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        int result= findTrapWater(arr);
        System.out.println(result);
    }
}