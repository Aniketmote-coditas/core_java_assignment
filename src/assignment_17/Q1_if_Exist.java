package assignment_17;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Q1_if_Exist {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.contains(3));
        System.out.println(set.contains(11));
    }
}
//true
//false