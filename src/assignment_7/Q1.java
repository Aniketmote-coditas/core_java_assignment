package assignment_7;
import java.util.*;

import static java.util.Arrays.binarySearch;

public class Q1 {
    public static void main(String [] args){
        char [] charArray ={'a','b','c','z','e','s','o','p','y'};

        System.out.println(binarySearch(charArray,'c'));//return the index of occurence.

        for (char a:charArray) {
            System.out.println(a);
        }
    }
}
