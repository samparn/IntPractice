package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main (String[] args){
        //1. How would you remove duplicates from a list using streams?
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> withoutDup = list.stream().distinct().toList();
        System.out.println(withoutDup);

        //2. Convert List of Strings to Comma-Separated String
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        String joint = items.stream().collect(Collectors.joining(","));
        System.out.println(joint);

        //3. Find First String Starting with a Prefix
        List<String> names = Arrays.asList("Brian", "Alex", "Adam", "Amanda", "Charles");
        String prefix = names.stream()
                .filter(n -> n.startsWith("A"))
                .findFirst()
                .orElse("None");
        System.out.println(prefix);

        //4. Find Second Highest Number in List
        List<Integer> numbers = Arrays.asList(4, 7, 1, 9, 7, 3, 9);
        int secH = numbers.stream().sorted().distinct().skip(1).findFirst().orElse(-1);
        System.out.println(secH);

        //5.  Flatten a List of Lists
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("a", "b"),
                Arrays.asList("c", "d"),
                Arrays.asList("e")
        );
        List<String> flatList = nestedList.stream().flatMap(l -> l.stream()).toList();
        System.out.println(flatList);

        //6. Count Frequency of Characters in a String
        String input = "stream";
        Map<Character, Long> freq =  input.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(freq);

        //7. How do you sort a list of employees by name and then by age?
        List<Person> employees = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Alice", 22)
        );
        List<Person> sortedPerson =  employees.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(Person::getAge)).toList();
        sortedPerson.forEach(person -> System.out.println(person.getName() + person.getAge()));

        //8. Partition a List of Numbers into Even and Odd
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> partiton = number.stream().collect(Collectors.partitioningBy(n -> n%2 ==0));
        System.out.println(partiton);

        //9. Sum of Squares of Numbers Greater Than a Threshold
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        int threshold = 2;
        int sumSquare = numbers1.stream().filter(n -> n > 2).mapToInt(n -> n * n).sum();
        System.out.println(sumSquare);
    }
}
