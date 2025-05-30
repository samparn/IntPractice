package practice;

import java.util.Arrays;
import java.util.List;

public class PrefixPrint {
    public static void main (String[] args) {
        String[] strings = {"apple", "apricot", "banana", "avocado"};
        String prefix = "ap";
        List<String> filtered = Arrays.stream(strings).filter(s -> s.startsWith(prefix)).toList();
        System.out.println(filtered);
    }
}
