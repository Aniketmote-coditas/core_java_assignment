package assignment_7;
import java.util.*;
public class array_asce_desc {
    public static void main(String [] args){
        Integer [] arr = {1,4,7,23,56,11,89,123,2,4};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(Integer in : arr){
            System.out.println(in);
        }

    }
}
/*
1
2
4
4
7
11
23
56
89
123
123
89
56
23
11
7
4
4
2
1

 */
