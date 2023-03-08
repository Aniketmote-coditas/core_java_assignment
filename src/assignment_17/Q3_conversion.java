package assignment_17;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q3_conversion {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        HashSet<Integer> hash = new HashSet<>(set);
        for (Integer i:hash) {
            System.out.println(i);
        }

        HashSet<Integer> h = new HashSet<>();
        h.add(90);
        TreeSet<Integer> t = new TreeSet<>(h);
        for (Integer i:t) {
            System.out.println(i);
        }

        int[] array = hash.stream().mapToInt(Integer::intValue).toArray();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }


    }
}
