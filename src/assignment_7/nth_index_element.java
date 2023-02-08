package assignment_7;
import java.sql.SQLOutput;
import java.util.*;
public class nth_index_element {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        int inputIndex =sc.nextInt();
        int [] arr = {1,4,5,2,67,89,34,56,767,345,5543,5346,5346534,36645,656456,5645654,456546,456546};
        System.out.println(arr[inputIndex]);
    }
}
/*
Enter the index
4
67
 */
