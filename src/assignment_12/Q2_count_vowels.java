package assignment_12;

import java.util.Scanner;
class vowels{
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        int v=0;
        int c=0;
        for (int i = 0; i < str.length(); i++) {
            // check if char[i] is vowel
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                v++;

            }else{
                c++;
            }
        }
        System.out.println("vowels count is "+v);
        System.out.println("consonent couont is "+ c);
    }
}
public class Q2_count_vowels {
    public static void main(String[] args) {
        vowels v = new vowels();
        v.display();
    }
}
 /*
    Enter the String
aniket
vowels count is 3
consonent couont is3

  */
