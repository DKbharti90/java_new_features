package java8feature;


import java8feature.model.Department;
import java8feature.model.Employee;
import java8feature.model.Person;

import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * Stream API is the java 8 powerful feature work with sequence of data (collection like list and sets etc..)
 *  it uses especially when dealing with large data
 *  Type of stream
 *  1. Sequential stream:-Operations are executed in single thread
 *  2. Parallel stream :- Operation are executed in the multiple thread , which and improve the performance to handle the large data
 *
 *  There are two types of operation in stream
 *  1. Intermediate Operation:- Return new stream, allowing to chaining of operation
 *  2. Terminal operation:-Produce a result or a side effect and close the stream
 *
 * */

public class StreamAPIClass {



    public static void main(String[] args) {

        /**
         * Intermediate Operation(lazy evaluated)
         * 1.filter(Predicate<T> predicate)
         * filter elements base on conditions
         * */

        List<String> nameList= Arrays.asList("Jon","mohan", "Jack","Shyam","jane");
        nameList.stream().filter(names->names.startsWith("S")).forEach(System.out::println);

        /**
         * Intermediate Operation(lazy evaluated)
         * 2.map(Function<T, R> mapper):
         * transforms each element to another type.
         *
         * */

        nameList.stream().map(String::toUpperCase).forEach(System.out::println);

        /**
         *
         * Intermediate Operation(lazy evaluated)
         * 3.sorted(Comparator<T> comparator)
         * Sorts the elements.
         *
         * */

        nameList.stream().sorted().forEach(System.out::println);


        /**
         *
         * Terminal Operations
         * 1. foreach(Consumer<T> action)
         * Applies a function for each element (does not return a value)
         *
         * */

        nameList.stream().forEach(System.out::println);


        /**
         * Terminal Operation
         * 2. collect(Collector<T,A,R> collector)
         * Gather the element in to the collection
         *
         * */


        List<String> filteredName=nameList.stream().filter(name->name.startsWith("J")).collect(Collectors.toList());



        //Direct toListMethod
        List<String> filteredName2=nameList.stream().filter(name->name.startsWith("J")).toList();

        //Collector to store thr the data for the groupby

        List<Person> personList=new ArrayList<>();
        Person person1=new Person("Banglore","Karnataka","Mohan Kumar");
        Person person2=new Person("Manglore","Karnataka","Pinay Kumar");
        Person person3=new Person("Banglore","Karnataka","SHANU Kumar");
        Person person4=new Person("Nalanda","Bihar","Rohan Kumar");
        Person person5=new Person("Nawada","Bihar","Raunak Kumar");
        Person person6=new Person("Nalanda","Bihar","Somen Kumar");
        Person person7=new Person("Nalanda","Bihar","SUNKY Kumar");
        Person person8=new Person("PATRATU","Jharkhand","RAJA Kumar");
        Person person9=new Person("Koderma","Jharkhand","RAJU Kumar");
        Person person10=new Person("Koderma","Jharkhand","KARU Kumar");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        personList.add(person7);
        personList.add(person8);
        personList.add(person9);
        personList.add(person10);


        Department department1=new Department("MATH","M");
        Department department2=new Department("SCIENCE","SC");
        Department department3=new Department("SOCIALSCIENCE","SCS");




        List<Employee> employees=new ArrayList<>();
        Employee emp1=new Employee("Mohan Kumar","EMP001",50000,department1);
        Employee emp2=new Employee("Rohan Kumar","EMP004",30000,department1);
        Employee emp3=new Employee("Sohan Kumar","EMP002",10000,department2);
        Employee emp4=new Employee("Tohan Kumar","EMP005",10000,department2);
        Employee emp5=new Employee("Pohan Kumar","EMP006",16000,department2);
        Employee emp6=new Employee("Nohan Kumar","EMP007",26000,department2);
        Employee emp7=new Employee("Bohan Kumar","EMP008",40000,department3);
        Employee emp8=new Employee("RAJ Kumar","EMP009",100000,department3);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
        employees.add(emp6);
        employees.add(emp7);
        employees.add(emp8);









        Map<String, List<Person>> peopleByCity   = personList.stream().collect(Collectors.groupingBy(Person::getCity));

        //The following will classify Person objects by state and city, cascading two Collectors together:
        Map<String, Map<String, List<Person>>> peopleByStateAndCity     = personList.stream().collect(Collectors. groupingBy(Person::getState, Collectors. groupingBy(Person::getCity)));


        List<String> list = personList.stream().map(Person::getName).collect(Collectors.toList());
        // Accumulate names into a TreeSet
        Set<String> set = personList.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
        // Convert elements to strings and concatenate them, separated by commas
        String joined = personList.stream().map(Object::toString).collect(Collectors. joining(", "));

        // Compute sum of salaries of employee
        int total = employees. stream().collect(Collectors. summingInt(Employee::getSalary));
        // Group employees by department
        Map<Department, List<Employee>> byDept = employees. stream()   .collect(Collectors. groupingBy(Employee::getDepartment));
        // Compute sum of salaries by department
        Map<Department, Integer> totalByDept = employees. stream()   .collect(Collectors. groupingBy(Employee::getDepartment,                                  Collectors. summingInt(Employee::getSalary)));  // Partition students into passing and failing Map<Boolean, List<Student>> passingFailing = students. stream()   .collect(Collectors. partitioningBy(s -> s. getGrade() >= PASS_THRESHOLD));



    }







}
