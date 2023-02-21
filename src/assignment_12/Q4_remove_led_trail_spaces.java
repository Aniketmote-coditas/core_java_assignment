package assignment_12;
class Remove{
    public void display(){
        String str = new String("  aniket  ");
        str = str.trim();
        System.out.println("After removeing spaces "+ str);
        System.out.println("unicode of char at index 5 is "+ str.codePointAt(5));
    }
}
public class Q4_remove_led_trail_spaces {
    public static void main(String[] args) {
        Remove r = new Remove();
        r.display();
    }
}
/*
After removeing spaces aniket
unicode of char at index 5 is 116

 */