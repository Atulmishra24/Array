//1010101 = decimal 
public class binarytoDecimal {
    
    public static int findDecimal(int binNum){
        int pow = 0;
        int Decimal =0;
        while(binNum>0){

            //Find Last digit 
            int lastDigit = binNum%10;
            Decimal = Decimal + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        return Decimal;
    } 


    public static void main(String[] args) {
       int binary = 1010101;
       int result = findDecimal(binary);    
       System.out.println("The Decimal of "+ binary + " is : "+ result);
     }
}
