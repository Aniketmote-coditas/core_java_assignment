package assignment_6;

public class pattern_1 {
    public static void main(String [] args){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        int n1=6;
        int A =65;
        for(int i=0;i<(n1*2);i++){
            int maxcol=(i<n)?n1-i:i-n1+1;
            if(maxcol!=0) {
                for (int col = 0; col < maxcol; col++) {
                    System.out.print((char) (A + col) + " ");
                }
                System.out.println();
            }else{
                System.out.print((char)A+" ");
                System.out.println();
            }
        }
    }
}
//output
/*      *
        * *
        * * *
        * * * *
        * * * * *
        -----------------------------------
        A B C D E F
        A B C D E
        A B C D
        A B C
        A B
        A
        A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F

 */

