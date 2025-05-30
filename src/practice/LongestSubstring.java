package practice;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LongestSubstring {
    public static void main (String[] args) {
        String s = "abcabcbb";
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for(char c : s.toCharArray())
        {
            lhs.add(c);
        }
        lhs.reversed();
        StringBuilder sb = new StringBuilder();
        lhs.forEach(c -> sb.append(c));
        System.out.println(sb.toString());
    }
}
