package assignment_14;


import java.util.Scanner;

public class CustomExceptionMain {
    public static void main(String[] args) {

        System.out.println("WELCOME TO THE BANK");
        Scanner sc = new Scanner(System.in);
        System.out.println("PLEASE ENTER 1 FOR DEPOSIT AND 2 FOR WITHDRAWAL");
        int n = sc.nextInt();

        AmountExceptionChecker amountExceptionChecker = new AmountExceptionChecker();

        if(n==1){
            System.out.println("please enter the deposite amount");
            int num = sc.nextInt();
            amountExceptionChecker.deposit(num);
        }else{
            System.out.println("please enter the withdrawal amount");
            int num = sc.nextInt();
            amountExceptionChecker.widthdrawal(num);
        }

    }
}
/*
WELCOME TO THE BANK
PLEASE ENTER 1 FOR DEPOSIT AND 2 FOR WITHDRAWAL
2
please enter the withdrawal amount
6000
The amount enter  is greater than balance
*/
