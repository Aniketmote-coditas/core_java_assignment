package assignment_14;

public class AmountExceptionChecker {
    int accBalance=5000;
    public void deposit(int n){

            try {
                if(n<0 || n==0) {
                    throw new InvalidAmountException(" deposit is ***INVALID****");
                }
            } catch (InvalidAmountException e) {

            }
    }
    public void widthdrawal(int n){
        try {
            if(n<0 || n==0) {
                throw new InvalidAmountException("widthdrawal is ***INVALID****");
            }
            try{
            if(n>accBalance){
                throw new InsufficientBalanceException(" is greater than balance");
            }
            }catch (InsufficientBalanceException e){

            }
        } catch (InvalidAmountException e) {

        }
    }
}
