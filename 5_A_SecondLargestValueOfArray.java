public class SecondLargestValueOfArray {
    public static void main(String[] args) {
        // non Optimal approach
        // int arr[]={34,21,54,65,43};
        // int max =0,secondmax=0;
        // for (int i = 0; i < arr.length; i++) {
        //     if(arr[i]>max){
        //         max=arr[i];
        //     }
        //    }

        //    for (int j = 0; j < arr.length; j++) {
        //     if(arr[j]> secondmax && arr[j]!=max){
        //         secondmax=arr[j];
        //     }
        // }
        // System.out.println(secondmax + " "+ max);
        int[] arr = { 34, 21, 54, 65, 43 };
        int arr_size = arr.length;
        int i, first, second;
        // There should be at least two elements
        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }
        int largest = second = Integer.MIN_VALUE;

        // Find the largest element
        for (i = 0; i < arr_size; i++)
            largest = Math.max(largest, arr[i]);

        // Find the second largest element
        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }
        if (second == Integer.MIN_VALUE)
            System.out.printf("There is no second " +
                    "largest element\n");
        else
            System.out.printf("%d\n", second);
    }



    }

