import java.util.Arrays;

public class SwapAllZeroToLast {

    public static void main(String[] args) {
       // int []arr1 = new int[7];
        int []arr2={0,0,0,1,3,2,5,3,0,2,2};
        int []arr3=  swapZerosToEnd(arr2);

        for (int i=0;i<arr3.length-1; i++){
            System.out.println(arr3[i]);
        }

    }


    public static int[] swapZerosToEnd(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
            }
        }
        return arr;
    }
    
}