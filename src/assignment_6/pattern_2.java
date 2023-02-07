package assignment_6;

public class pattern_2 {
    public static void main(String [] args){
        int row=5;
        int col=9;

        for(int i=0;i<row;i++){
            int noOfSpaces=i;
            for(int k=0;k<noOfSpaces;k++){
                System.out.print("  ");
            }
            for(int j=0;j<col;j++){
                System.out.print("* ");

            }
            col=col-2;
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------------");

        int n=6;
        int A =65;
        for(int i=0;i<(n*2-1);i++){
            int ncol=(i<n)?(i+1):(n*2-1)-i;
            for(int j=0;j<ncol;j++){
                System.out.print((char)(A+j)+" ");
            }
            System.out.println();
        }
    }
}
//output
/*
 * * * * * * * * *
   * * * * * * *
    * * * * *
      * * *
        *
A
A B
A B C
A B C D
A B C D E
A B C D E F
A B C D E
A B C D
A B C
A B
A


 */
