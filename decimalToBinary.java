public class decimalToBinary {

    public static int findBinary(int dec) {
        int pow =0;
        int binary = 0 ;
        while(dec>0){
            int remainderbyTwo = dec%2;
            binary += remainderbyTwo*(int)Math.pow(10,pow);
            pow++;
            dec /=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int decimal = 23;
        int result = findBinary(decimal);
        System.out.println("The Binary of "+decimal + " is : "+ result);
    }
}