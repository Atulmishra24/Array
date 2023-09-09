public class ArrAssTrapingRain{

    public static int findTrapWater(int arr[]){
        int n = arr.length;
        int trapWater= 0;
        
        //Left Max Value
        int leftMax []= new int[n];
        leftMax[0] = arr[0];
        for(int i =1; i<n ; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }

        //Right Max value
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i =n-2; i>=0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }

        for(int i = 0; i<n; i++){
            int waterLevel= Math.min(rightMax[i], leftMax[i]);
            trapWater += waterLevel - arr[i];
        }

        return trapWater;
    }

    public static void main(String[] args) {
        int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
        int result= findTrapWater(arr);
        System.out.println(result);
    }
}
