public class DuplicateNumber {
    public static void main(String[] args) {
        int arr [] = {1,2,3,3,4,4,5,5,6};
        int flag = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    flag++;
                    System.out.println("The duplicate number found at :"+i+"\n And Duplicate number is "+ arr[i]);
                }
            }
        }
        System.out.println("Number of duplicate is : "+ flag);
    }
}
