package assignment_6;

public class code_using_if {
    public static void main(String [] args){
        int m=2,x=0;
        if(m==0){
            x+=2;
            System.out.println("X="+x);
        }else if(m==1){
            x+=4;
            System.out.println("X="+x);
        }else if(m==2){
            x+=6;
            System.out.println("X="+x);
        }
        //output for this code where m==2 is "X=6"
    }
}
