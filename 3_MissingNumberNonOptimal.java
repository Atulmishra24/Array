public class MissingNumberNonOptimal {
    public static void main(String[] args) {
        int [] arr = {0,1,2,3,4,5,7,8,9};
        int [] copy = new int[arr.length+1];
        for (int i = 0; i < copy.length; i++) {
            copy[i]=i;
        }
        //{0,1,2,3,4,5,6,7,8,9}
        for (int i = 0; i < arr.length; i++) {
            if(copy[i]!=arr[i]){
               System.out.println("Missing number is "+ i);
               break;
            }
        }
       
    }
}
