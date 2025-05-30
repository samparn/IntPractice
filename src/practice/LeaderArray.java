package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderArray {
    public static void main(String[] args){
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> result = leaders2(arr);
        result.forEach(r -> System.out.print(r + ","));
    }
    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> leaderAL = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=i;j<arr.length;j++){
                if(arr[i]< arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                leaderAL.add(arr[i]);
            }
        }
        return leaderAL;
    }

    public static ArrayList<Integer> leaders2(int[] arr){
        ArrayList<Integer> leaderAL = new ArrayList<>();
        int max = arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
          if(arr[i]>=max)
          {
              leaderAL.add(arr[i]);
              max = arr[i];
          }
        }
        Collections.reverse(leaderAL);
        return leaderAL;
    }
}
