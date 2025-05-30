package practice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Optional;

public class NonRepChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println(nonRep2(s));
    }

    private static char nonRep(String s) {
        for(char c : s.toCharArray())
        {
            if(s.indexOf(String.valueOf(c)) == s.lastIndexOf(String.valueOf(c))){
                return c;
            }
        }
        return '\u0000';
    }
    private static char nonRep2(String s) {
        Map<Character,Integer> freq = new LinkedHashMap<>();
        for(char c : s.toCharArray())
        {
            if(freq.containsKey(c)){
                freq.put(c,freq.get(c)+1);
            }
            else {
                freq.put(c,1);
            }
        }
        freq.forEach((k,v) -> System.out.println(k + "=" +v));
        Optional<Optional<Map.Entry<Character, Integer>>> first = Optional.of(freq.entrySet().stream().filter(entry -> entry.getValue()==1).findFirst());
//        System.out.println(first.get().get().getKey());
        return first.get().get().getKey();
    }
}
