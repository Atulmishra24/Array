public class Missing_Number_Optimal_Approach {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,9};
        int len = arr.length;
        int totalSum = (((len+1)*(len+2)))/2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum= arrSum+arr[i];
        }
        int missingValue= totalSum-arrSum;
        System.out.println("Missing Number is : "+ missingValue);
    }
}
