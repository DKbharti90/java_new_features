package java8feature;

import java8feature.model.MyClass;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * Method reference is the new feature introduced in java 8
 * and its is annotated by ::
 * its is concise alternative to lambda expression when lambda expression simply call an existing method
 *  There are 4 type of method reference
 *  1. Reference to static method
 *  2. Reference to an instance method or particular object
 *  3. Reference to an instance of method of an arbitrary object(the object passed in the parameter) of a particular type
 *  4. Reference to a constructor
 *
 * */

public class MethodReference {
    public static void main(String[] args) {


        /**
         * 1.Reference to a Static Method
         * We can use the static method with class name
         * like : ClassName::staticMethodName
         *
         * */
        // It will convert String in Integer
        Function<String, Integer> lambda=s->Integer.parseInt(s);

        Function<String,Integer> refrence=Integer::parseInt;


        // But reference has one limitation:-> It can only accept the
        System.out.println(lambda.apply("123"));  // Output: 123
        System.out.println(refrence.apply("456"));  // Output: 456


        /**
         * Reference to an instance method for a particular object
         * we can Use the instance method of a specific object for the particular class
         * like : instance::instanceMethodName
         *
         */

        String str = "Hello, World!";

        //With lambda
        Supplier<Integer> supplierWithLambda=()->str.length();

        Supplier<Integer> supplierWithRef=str::length;


        System.out.println(supplierWithLambda.get());  // Output: 13
        System.out.println(supplierWithRef.get());  // Output: 13


        /**
         *
         * Reference to an instance method of an Arbitrary object for a particular type
         *
         * we can use the instance method of an arbitrary object of a specific method like "Comparator, Predicates"
         * like :ClassName::instanceMethodName
         *
         * */


        List<String> names= Arrays.asList("Mohan", "Raman","Dolly");

        //using lambda
        names.forEach(name->System.out.println(name));

        //using the method referance
        names.forEach(System.out::println);


        /**
         *
         * Reference to a constructor
         *  to achieve this we have use the new keyword
         *  like : ClassName::new
         *
         *
         * */

        //Using lambda
        Supplier<MyClass> myClassSupplier=()->new MyClass();

        //Using Reference method
        Supplier<MyClass> myClassSupplier1=MyClass::new;


        MyClass obj1=myClassSupplier.get();
        MyClass obj2=myClassSupplier1.get();


        System.out.println(obj1.getValue());  // Output: Default Value
        System.out.println(obj1.getValue());  // Output: Default Value


    }




}

