import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TWODARRAYDS1 {
    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>();

        // Adding some sample data
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,1,0,0,0,0));
        arr.add(Arrays.asList(1,1,1,0,0,0));
        arr.add(Arrays.asList(0,0,0,0,0,0));
        arr.add(Arrays.asList(0,0,0,0,0,0));
        arr.add(Arrays.asList(0,0,0,0,0,0));

        System.out.println(String.valueOf(hourglassSum(arr)));

    }


    public static int hourglassSum(List<List<Integer>>  arr) {
        int maxSum=0;
        // Write your code here

        for (int i=0; i<4; i++) {
            for(int j=0; j<4;j++){

                int sum =       arr.get(i).get(j) +
                                arr.get(i).get(j + 1) +
                                arr.get(i).get(j + 2) +
                                arr.get(i + 1).get(j + 1) +
                                arr.get(i + 2).get(j)+
                                arr.get(i + 2).get(j + 1) +
                                arr.get(i + 2).get(j + 2);

                if (maxSum < sum) {
                    maxSum = sum;
                }

            }
        }
        return maxSum;

    }

}
