package assignment_7;
import java.util.*;
public class array_copy_into_another_array {
    public static void main(String [] args){
        int [] arr1 = {1,4,7,23,56,11,89,123,2,4};
        int[] copy = Arrays.copyOfRange(arr1, 0, arr1.length-1);
        for(int i=0;i<copy.length;i++){
            System.out.println(copy[i]);
        }

    }
}
/*
{1,4,7,23,56,11,89,123,2,4}
 */
