package java8feature;

/**
 * The interface that contains only one abstract method *
 * 1. From java 8 onward lambda expression can be used to represent the instance of functional interface
 * 2. Functional Interface can have any number of default method
 * 3. Runnable,ActionListener and Comparable are Some Example of Functional Interface
 * */


@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public abstract int calculate(int x);
}
