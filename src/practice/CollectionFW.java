package practice;

import java.util.*;

public class CollectionFW {
    public static void main (String[] args)
    {
        //Set
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("1");
        set.remove(2);
        for(String s : set){
            System.out.println (s);
        }
        //HashSet
        Set<Integer> linkedhs = new LinkedHashSet<>();
        int a =1;
        linkedhs.add(a);
        linkedhs.add(4);
        linkedhs.add(2);
        linkedhs.add(4);
        linkedhs.remove(4);
        for (int i : linkedhs){
            System.out.println(i);
        }
        //SortedSet
        SortedSet<String> sorteds = new TreeSet<>();
        sorteds.add("ddr");
        sorteds.add("aay");
        sorteds.add("a");
        Iterator<String> itss = sorteds.iterator();
        while(itss.hasNext())
        {
            System.out.println(itss.next());
        }
        for (String s : sorteds){
            System.out.println(s);
        }
        //Queue
        Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(-1);
        int size = q.size();
        for(int i =0; i<size;i++){
            System.out.println(q.remove());
        }
        //Arraylist
        List<String> arlist =  new ArrayList<>();
        arlist.add("hi");
        arlist.add("hello");
        arlist.remove("hi");
        //arlist.remove(0);
        Iterator<String> arlit = arlist.iterator();
        while(arlit.hasNext())
        {
            System.out.println(arlit.next());
        }
        //LinkedList
        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.remove((Integer)2);
        ll.forEach (System.out::println);
        //Vector
        Vector<Integer> vector =  new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.remove(0);
        vector.forEach( v -> System.out.println(v));
        //Stack
        Stack<String> stack = new Stack<>();
        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.forEach(s -> System.out.println(s));
        System.out.println(stack.pop() + stack.peek() + stack.pop());
    }
}
