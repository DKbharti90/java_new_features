import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Feature {

    public static void main(String[] args) {
        List<String> stringList=new ArrayList<>();
        stringList.add("Ram");
        stringList.add("Shyam");
        stringList.add("Mohan");

        /*
        * 1. FOR EACH METHOD
        *
        * Java provides a new method foreach method iterate thr elements.
        * its define in the iterable and Stream interfaces.
        * it is default method define in Iterable interface.
        * Connection class extend the iterable interface can use for each method.
        * So method takes single parameter which is functional interface, So we can pass the lambda expression as an argument.
        *
        *
        *
        * */

        stringList.forEach(singleDataOfList->System.out.println(singleDataOfList));


        stringList.forEach(System.out::println);

        List<String> filteredList=stringList.stream().filter(one-> !one.contains("Mohan")).map(one->"God "+one).toList();
        filteredList.forEach(System.out::println);


        ArrayList<String>  list = new ArrayList<String>();
        list.add("cat");
        list.add("dog");
        list.add("rat");
        list.add("mouse");
        list.add("monkey");
        System.out.println("List before swapping the elements is " +list);
        /*calling the swap function */
        Collections.swap(list, 2, 3);
        System.out.println("List after swapping the elements is :" +list);
    }
}
