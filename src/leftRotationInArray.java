import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leftRotationInArray {


    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> b=rotLeft(list,3);
        b.forEach(System.out::println);
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {

        for(int i=0; i<(d%a.size()); i++){
            int first = a.get(0);
            for(int j=0; j<a.size()-1; j++){
                a.set(j,a.get(j+1));
            }
            a.set(a.size()-1,first);

        }

        return a;
    }
}
