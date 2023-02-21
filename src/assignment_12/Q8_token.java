package assignment_12;
import java.util.*;
class OperatorOperants{
    void display(){
        ArrayList<String> operators = new ArrayList<>();
        ArrayList<String> operands = new ArrayList<>();
        StringTokenizer str = new StringTokenizer("3+20%2*20/2","[+%-/*]",true);
        int i=0;
        while(str.hasMoreTokens()){
            if(i%2==0){
                operands.add(str.nextToken());
            }
            else{
                operators.add(str.nextToken());
            }
            i++;
        }
        System.out.println(operators);
        System.out.println(operands);
    }
}
public class Q8_token {
    public static void main(String[] args) {
        OperatorOperants operatorOperants = new OperatorOperants();
        operatorOperants.display();
    }
}
/*
[+, %, *, /]
[3, 20, 2, 20, 2]
 */