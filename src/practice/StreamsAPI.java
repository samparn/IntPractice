package practice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsAPI {
    public static void main (String[] args)
    {
        //1. Find the longest string in a list of strings using Java streams:
        List<String> strings = Arrays
                .asList();
        Optional<String> longest = Optional.of(strings.stream()
                .max(Comparator.comparingInt(s -> s.length()))
                .orElse("null"));
        System.out.println(longest.get());

        //2. Calculate the average age of a list of practice.Person objects using Java streams:
        List<Person> persons = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );
        Optional<OptionalDouble> avgAge = Optional.of(OptionalDouble.of(persons.stream()
                .mapToInt(person -> person.age)
                .average().orElse(0)));
        System.out.println(avgAge.get());

        //3. Check if a list of integers contains a prime number using Java streams:
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream().anyMatch(num -> isPrime(num));
        System.out.println(containsPrime);

        //4. Merge two sorted lists into a single sorted list using Java streams:
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> mergedList = Stream.concat(list1.stream(),list2.stream())
                                        .sorted().toList();
        System.out.println(mergedList);

        //5. Find the intersection of two lists using Java streams:
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(3, 4, 5, 6, 7);
        List<Integer> intersection = list3.stream()
                .filter(n ->list2.contains(n))
                .toList();
        System.out.println(intersection);

        //6.  Remove duplicates from a list while preserving the order using Java streams:
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> numbersWithoutDuplicates = numbersWithDuplicates.stream().distinct().toList();
        System.out.println(numbersWithoutDuplicates);

        //7. Given a list of transactions, find the sum of transaction amounts for each day using Java streams:
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300),
                new Transaction("2022-01-02", 400),
                new Transaction("2022-01-03", 500)
        );
        Map<String, Integer> sumByDay = transactions.stream()
                .collect(Collectors.groupingBy(t -> t.date, Collectors.summingInt(s -> s.amount)));
        System.out.println(sumByDay);

        //8. Find the kth smallest element in an array using Java streams:
        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 2;
        int kelement = Arrays.stream(array).sorted().skip(k-1).findFirst().orElse(-1);
        System.out.println(kelement);

        //9. Given a list of strings, find the frequency of each word using Java streams:
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(wordFrequency);

        //10. Implement a method to partition a list into two groups based on a predicate using Java streams:
        List<Integer> numb = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean,List<Integer>> partiton = numb.stream()
                .collect(Collectors.partitioningBy(n -> n%2 ==0));
        List<Integer> evenNo = partiton.get(true);
        List<Integer> oddNo = partiton.get(false);
        System.out.println(evenNo);
        System.out.println(oddNo);


    }
    private static boolean isPrime(int num){
        if(num<=1)
            return false;

        for(int i =2 ;i<num;i++){
            if(num%i == 0)
                return false;
        }
        return true;
    }
}
