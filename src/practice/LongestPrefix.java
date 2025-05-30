package practice;

import java.util.Arrays;
import java.util.List;

public class LongestPrefix {
    public static void main (String[] args) {
        String[] strings = {"apple", "apricot", "avocado"};
        String first = strings[0];
        String prefix ="";
        boolean flag =false;
//        List<String> filtered = Arrays.stream(strings).filter(s -> s.startsWith(prefix)).toList();
        for(int i=0;i<first.length();i++)
        {
            for(int j = 0;j<strings.length;j++){
                if(!(strings[j].startsWith(first.substring(i,i+1)))){
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
            prefix+=first.substring(i,i+1);
        }
        System.out.println(prefix);
    }
}
