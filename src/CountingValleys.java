import java.util.HashMap;

public class CountingValleys {

    public static void main(String[] args) {
        int step=8;
        String path="UDDDUDUU";

        countingValleys(step,path);
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int valleyCount=0;
        int start = 0;
        HashMap<Character,Integer> hashMap=new HashMap<>();
        hashMap.put('U',1);
        hashMap.put('D',-1);

        for (int i=0 ; i < path.length(); i++){
            char step = path.charAt(i);
            start=start+hashMap.get(step);

            if (step == 'U' && start == 0) {
                valleyCount++;
            }

        }


        return valleyCount;


    }
}
