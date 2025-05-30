package practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInter {
    public static void main(String[] args){
        //HashMap
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("ABC","ABC");
        for(Map.Entry<String, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //Linked Hashmap
        LinkedHashMap<Integer,Integer> llmap = new LinkedHashMap<>();
        llmap.put(1,1);
        llmap.put(2,2);
        llmap.put(3,3);
        llmap.remove(3);
        llmap.remove(1,3);
        llmap.forEach((k,v) -> System.out.println(k+","+v));
        //Treemap
        TreeMap<String,String> tmap = new TreeMap<>();
        tmap.put("hi","1");
        tmap.put("zz","2");
        tmap.put("x","3");
        tmap.reversed().forEach((k,v) -> System.out.println(k + "," + v));
    }
}
