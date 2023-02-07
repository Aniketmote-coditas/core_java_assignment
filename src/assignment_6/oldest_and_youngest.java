package assignment_6;
import java.util.*;
public class oldest_and_youngest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age1= sc.nextInt();
        int age2=sc.nextInt();
        int age3=sc.nextInt();
        int oldest=0;
        int youngest=0;
        if(age1>age2 && age1>age3){
            oldest=age1;
        }else if(age2>age1 && age2>age3){
            oldest=age2;
        }else{
            oldest=age3;
        }
        if(age1<age2 && age1<age3){
            youngest=age1;
        }else if(age2<age1 && age2<age3){
            youngest=age2;
        }else{
            youngest=age3;
        }
        System.out.println("oldest is "+oldest);
        System.out.println("youngest is "+youngest);
    }
}
//output is
//Enter the age
//20
//60
//89
//oldest is 89
//youngest is 20
