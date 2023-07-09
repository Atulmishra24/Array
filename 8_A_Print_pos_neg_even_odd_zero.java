import java.util.Scanner;

public class A_Print_pos_neg_even_odd_zero {

    public static void PrintPNEOXZ(int arr[][]){
        int positiveNumber =0 , negativeNumber=0,EvenNumber=0,oddNumber=0,zeroNumber=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
           
                if (arr[i][j]>0){
                    positiveNumber++;
                    if(arr[i][j]%2==0){
                        EvenNumber++;
                    }
                    else{
                        oddNumber++;
                    }
                }
                else if (arr[i][j]<0){
                    negativeNumber++;
                    if(arr[i][j]%2==0){
                        EvenNumber++;
                    }
                    else{
                        oddNumber++;
                    }
                    
                }
                else{
                    zeroNumber++;
                    if(arr[i][j]%2==0){
                        EvenNumber++;
                    }
                    else{
                        oddNumber++;
                    }
                }
               
            }
        }
        
        System.out.println("number of positive numbers = "+ positiveNumber);
        System.out.println("number of negative numbers = "+ negativeNumber);
        System.out.println("number of odd numbers ="+oddNumber);
        System.out.println("number of even numbers= "+EvenNumber);
        System.out.println("number of 0 = "+zeroNumber);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[4][4];
        System.out.println("Enter the Matrix values: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();               
            }
        }
        PrintPNEOXZ(arr);
    }
}
