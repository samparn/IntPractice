package practice;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPractice2 {
    public static void main(String[] args){
//        Given a list of names, return all names that start with "A" (case-insensitive) in uppercase.
        List<String> names = Arrays.asList("Alice", "Bob", "Alex", "adam", "Brian");
        List<String> filterNames =  names.stream().filter((s -> s.toLowerCase().startsWith("a"))).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(filterNames);
        //Given a list of words, count the frequency of each word.
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        Map<String,Long> freq = words.stream().collect(Collectors.groupingBy(s ->s,Collectors.counting()));
        System.out.println(freq);

//        Group Employees by Department
        class Employee {
            String name;
            String department;
            Employee(String name, String department) {
                this.name = name;
                this.department = department;
            }
            String getDepartment() { return department; }
            String getName() { return name; }
        }

        List<Employee> employees = Arrays.asList(
                new Employee("John", "IT"),
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Jane", "Finance")
        );

        Map<String, List<String>> filterEmp = employees.stream().collect(Collectors.
                groupingBy(Employee::getDepartment, Collectors.mapping(Employee::getName, Collectors.toList())));
        System.out.println(filterEmp);

        //Return the first element that occurs more than once in a list of strings.
        List<String> items = Arrays.asList("a", "b", "c", "a", "d", "c");
        Set<String> seen = new HashSet<>();
        Optional<String> s1 = items.stream().filter(s -> !seen.add(s)).findFirst();
        System.out.println(s1);

//        Sum of Even Numbers in a List
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sumR = numbers.stream().filter( i -> i%2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumR);

//        Write a lambda expression to add two integers using a custom functional interface.
        Adder adder = (a,b) -> a+b;
        System.out.println(adder.add(10,20));

//        Sort a list of strings using lambda comparator.
        List<String> names1 = Arrays.asList("Zoe", "Alexander", "Bob");
//        List<String> sorted = names1.stream().sorted(Comparator.comparing(String::length)).toList();
//        System.out.println(sorted);
        names1.sort((s3,s2) -> Integer.compare(s3.length(),s2.length()));
        System.out.println(names1);

//        Print only integers that match a predicate.
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = n -> n%2 ==0;
        printWithConditions(nums, isEven);

//        Use Consumer to print each string in a list.
        List<String> data = Arrays.asList("Java", "Spring", "Lambda");
        Consumer<String> printString = s -> System.out.print(s + ",");
        data.forEach(printString);
        System.out.println();

//         Convert Strings to Their Lengths Using Function
        List<String> items1 = Arrays.asList("Hi", "Lambda", "Stream");
        Function<String,Integer> lengthFunc = s -> s.length();
        List<Integer> lengthMap = items1.stream().map(lengthFunc).toList();
        System.out.println(lengthMap);
//        Trim a string and convert to uppercase. Chain Lambdas to Transform Strings

        Function<String, String> trimFunc = s -> s.trim();
        Function<String,String> upperFunc =  s-> s.toUpperCase();
        Function<String,String> chained = trimFunc.andThen(upperFunc);
        System.out.println(chained.apply("  jjsdhe   "));

        // Supplier
    }
    static void printWithConditions(List<Integer> nums, Predicate<Integer> predicate)
    {
        System.out.println(nums.stream().filter(predicate).toList());

    }
    @FunctionalInterface
    interface Adder{
        int add(int a, int b);
    }


}
