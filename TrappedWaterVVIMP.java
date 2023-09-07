public class TrappedWaterVVIMP{


    public static int findTrapWater(int [] height){
        int n = height.length;
        // Find Left Max Array
        int leftMax[] = new int[n];
        leftMax[0]=height[0];
        for(int i =1 ; i< n; i++ ){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // Find right Max Array(reversed Counting)
        int rightMax[] = new int[n];
        rightMax[n-1]= height[n-1];
        for(int i = n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i] , rightMax[i+1]);
        }

        //loop
        int trappedwater = 0;
        for(int i = 0 ; i<n ; i++){
            //WATER level
            
            int waterLevel = Math.min(leftMax[i] , rightMax[i]);
            // Trapped Water 
            // tw = (wl-heightofbar)*width
            trappedwater += waterLevel-height[i];

        }


        return trappedwater;

    
    }

    public static void main(String[] args) {
        int heightOfBar[] = {4,2,0,6,3,2,5};
        System.out.println(findTrapWater(heightOfBar));
    }

}