import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {

    public static void main(String[] args) {

        List<List<Integer>> arr=new ArrayList<>();
        arr.add(Arrays.asList(1,0,5));
        arr.add(Arrays.asList(1,1,7));
        arr.add(Arrays.asList(1,0,3));
        arr.add(Arrays.asList(2,1,0));
        arr.add(Arrays.asList(2,1,1));
        List<Integer> list=dynamicArray(3,arr);

       list.forEach(eachValue->System.out.println(eachValue));
       //method Refrence
       list.forEach(System.out::println);

    }

    public static List<Integer>  dynamicArray(int n,List<List<Integer>>  queries) {

        List<List<Integer>> computeArray=new ArrayList<>();
        List<Integer> result=new ArrayList<>();
        int lastAnswer=0;

        for(int i=0; i< n; i++){
            computeArray.add(new ArrayList<>());
        }

        for(int i=0; i<queries.size(); i++){
            List<Integer> itterator = queries.get(i);
            if(itterator.get(0)==1){
                int idx=((itterator.get(1)^lastAnswer)%n);
                computeArray.get(idx).add(itterator.get(2));
            }else{
                int idx=((itterator.get(1)^lastAnswer)%n);
                List<Integer> seq= computeArray.get(idx);
                lastAnswer=seq.get(itterator.get(2) % seq.size());
                result.add(lastAnswer);
            }
        }

        return result;


    }
}
