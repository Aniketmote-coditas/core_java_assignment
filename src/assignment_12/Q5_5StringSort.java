package assignment_12;

import java.util.Scanner;
import java.util.*;
class StringOp {
    public void display() {
        Scanner sc = new Scanner(System.in);
        String[] strr = new String[5];
        for (int i = 0; i < 5; i++) {
            strr[i] = sc.nextLine();
        }
        sort(strr);
        for (int i = 0; i < 5; i++) {
            System.out.println(strr[i]);
        }

        System.out.println("replace string");
        for(int i=0;i<5;i++){
            String str="";
            for(int j=0;j<strr[i].length();j++){
                char ch = strr[i].charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    ch++;
                }
                str+=ch;
            }
            strr[i]=str;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(strr[i]);
        }
    }

    public static void sort(String[] str) {
        int lastPos = str.length - 1;
        int minPos = 0;
        String s = "";
        for (int i = 0; i < lastPos-i; i++) {
            minPos = i;
            for (int j = i + 1; j <= lastPos; j++)
                if (str[j].compareTo(str[minPos]) < 0)
                    minPos = j;
            if (minPos != i) {
                s = str[i];
                str[i] = str[minPos];
                str[minPos] = s;
            }
        }

    }


}
public class Q5_5StringSort {
    public static void main(String[] args) {
        StringOp stringOp = new StringOp();
        stringOp.display();
    }
}
/*
anike
anik
ani
an
a
a
an
ani
anik
anike
replace string
b
bn
bnj
bnjk
bnjkf

 */
