package assignment_12;

import java.util.Scanner;
import java.util.*;

class Repeat{
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        String str1="";
        for(int i=0;i<str.length();i++){
            if(list.contains(str.charAt(i))){

            }else{
                list.add(str.charAt(i));
                str1 +=Character.toString(str.charAt(i));
            }
        }
        System.out.println("After removal of repeated string  "+str1);
    }
}
public class Q3_remove_repeated_char {
    public static void main(String[] args) {
        Repeat repeat = new Repeat();
        repeat.display();

    }
}
/*
Enter the String
aanniikkeett
After removal of repeated string  aniket

 */