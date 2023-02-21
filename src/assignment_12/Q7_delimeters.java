package assignment_12;


import java.util.StringTokenizer;

public class Q7_delimeters {
    public static void main(String[] args) {
        StringTokenizer temp = new StringTokenizer("Hi , all. Howareyou?","[,. ]");
        while(temp.hasMoreTokens()){
            System.out.println(temp.nextToken());
        }
    }
}
/*
Hi
all
Howareyou?
 */