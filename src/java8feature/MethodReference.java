package java8feature;

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






    }
}
