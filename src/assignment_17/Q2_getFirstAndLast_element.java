package assignment_17;
import java.util.*;
public class Q2_getFirstAndLast_element {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(10);

        Iterator<Integer> iterator = set.iterator();
        int first_element = iterator.next();
        System.out.println(first_element);
        int last_element = 0;
        while(iterator.hasNext()){
            int element  = iterator.next();
            if(!iterator.hasNext()){
                last_element = element;
            }
        }
        System.out.println(last_element);
    }
}
