public class TranverseArrayPrintEvenNo {
    public static void main(String[] args) {
        int [] arr =  {4,3,6,7,1} ;
        int [] arr1 = {34,21,54,65,43};
        for (int i : arr) {
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
