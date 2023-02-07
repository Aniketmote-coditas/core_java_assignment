package assignment_6;
import java.util.*;
public class greatest_among_them {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2=sc.nextInt();
        if(number1>number2){
            System.out.println("number" + number1+" is greatest");
        }else{
            System.out.println("number" +number2+ " is greatest");
        }
        //output : 10 20 number20 is greatest
    }
}
