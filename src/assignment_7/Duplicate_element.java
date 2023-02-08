package assignment_7;

import java.util.ArrayList;
import java.util.*;


public class Duplicate_element {
    public static void main(String [] args){
        int [] arr = {2,4,5,6,2,4,7,8};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                System.out.println("Duplicate element is : "+ arr[i]);
            }else{
                list.add(arr[i]);
            }
        }
        System.out.println("after duplicates is remove arr will be");
        for(Integer a : list){
            System.out.println(a);
        }


    }
}
/*
Duplicate element is : 2
Duplicate element is : 4
after duplicates is remove arr will be
2
4
5
6
7
8
 */
