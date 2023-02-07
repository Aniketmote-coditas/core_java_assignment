package assignment_6;

public class pattern_3 {
    public static void main(String [] args){
        int n=5;
        int col=7;
        int  ncol=1;
        for(int i=0;i<(n*2-1);i++){

            int spaces =(i<n)?((n-1)-i):(i-n+1);

            for(int k=0;k<spaces;k++){
                System.out.print("  ");
            }
            if(i<n){
                for(int j=0;j<ncol;j++){
                    System.out.print("* ");
                }
                ncol+=2;
            }else{

                for(int j=0;j<col;j++){
                    System.out.print("* ");
                }
                col-=2;
            }

            System.out.println();
        }
        System.out.println("-----------------------------------------------------");

        for(int i=1;i<=6;i++){
            char ch='A';
            for(int j=1;j<=i;j++){

                System.out.print(ch++);

            }
            ch--;
            for(int k=2;k<=i;k++){
                System.out.print(--ch);
            }
            System.out.println();
        }
    }
}
