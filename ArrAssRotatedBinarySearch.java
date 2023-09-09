public class ArrAssRotatedBinarySearch{

  

    public static int findtarget(int arr[], int n){
         int low = 0 , high= arr.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]==n){
                return mid;
            }

            if(arr[low]<=arr[mid]){
                if(arr[low]<= n && arr[mid]>n){
            high = mid-1;
           } 
           else{
            low=mid+1;
           }
            
            }
            else{
                if(arr[mid]<n && arr[high]>=n ){
                   low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }



     return -1;
    }

        
    
    public static void main(String[] args) {
     int arr[]= {4,5,6,7,0,1,2};
     int target = 0;
     int result = findtarget(arr,target);
     System.out.println(result); 
    }
}