package assignment_14;

public class InsufficientBalanceException extends Exception{
        InsufficientBalanceException(){

        }
        InsufficientBalanceException(String s){
            System.out.println("The amount enter "+s);
        }
}
