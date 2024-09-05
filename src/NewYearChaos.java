import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {


    public static void main(String[] args) {
        List<Integer> chaosList=new ArrayList<>();
        chaosList.add(2);
        chaosList.add(1);
        chaosList.add(5);
        chaosList.add(3);
        chaosList.add(4);
        minimumBribes(chaosList);
    }

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        int bribe = 0;
        for (int i = (q.size() - 1); i > 0; i--) {
            if (q.get(i - 1) == i + 1) {
                q.set(q.get(i - 1), q.get(i));
                q.set(q.get(i), q.get(i + 1));
                bribe = +1;

            } else if ((q.get(i - 2) > 0) && (q.get(i - 2) == i + 1)) {
                q.set(q.get(i - 2), q.get(i - 1));
                q.set(q.get(i - 1), q.get(i));
                q.set(q.get(i), q.get(i + 1));
                bribe = +1;
            } else {
                System.out.println("Too chaotic");
            }
        }
    }
}
