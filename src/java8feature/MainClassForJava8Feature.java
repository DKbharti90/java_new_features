package java8feature;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClassForJava8Feature {

    /**
     * Access of Functional class
     * with using of Runnable Interface
     * */


    public static void main(String[] args) {

        //Old method of Access
        new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();

        //New Method with the help of lambda

        new Thread(()->{
            System.out.println("new Thread Created with lambda");
        }).start();

        new Thread(()->System.out.println("Thread start")).start();


        // Functional interface

        FunctionalInterface functionalInterface=(int x)->x*x;
        int calculate=  functionalInterface.calculate(5);
        System.out.println(calculate);





        RecyclerViewOnClick recyclerViewOnClick=((int position, List<String> list)->{
            list.forEach(System.out::println);
        });

        List<String> stringList=new ArrayList<>();
        stringList.add("PPA");
        stringList.add("SPD");
        stringList.add("FGD");
        stringList.add("GHD");
        stringList.add("IUA");
        recyclerViewOnClick.onClick(6,stringList);


        //Without passing the data type
        FunctionalInterface functionalInterface2=(x)->x*x;
        int calculate2=  functionalInterface2.calculate(5);
        System.out.println(calculate);

        // Without passing the list in when we have more than one parameter
        RecyclerViewOnClick recyclerViewOnClick2=((position,list)->{
            list.forEach(System.out::println);
        });

        recyclerViewOnClick2.onClick(6,stringList);


        //Common use cases

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");
        names.forEach(name->System.out.println(name));
        //With reference method
        names.forEach(System.out::println);





    }







}
