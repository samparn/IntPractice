package practice;

public class CountBinaryZero {
    public static void main(String[] args) {
        int n = 9;
        String s = Integer.toBinaryString(n);
        long zeroCount = s.chars().mapToObj(c -> (char)c).filter(c1 -> c1=='0').count();
        System.out.println(zeroCount);
    }
}
