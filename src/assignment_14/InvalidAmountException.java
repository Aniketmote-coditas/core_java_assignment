package assignment_14;

public class InvalidAmountException extends Exception{
    InvalidAmountException(){

    }
    InvalidAmountException(String s){
        System.out.println("the amount you have enter for "+s);
    }
}
