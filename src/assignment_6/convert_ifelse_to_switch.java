package assignment_6;

public class convert_ifelse_to_switch {
    public static void main(String [] args){
        int var=1;
        switch (var){
            case 1:
                System.out.println("low");
                break;
            case 2:
                System.out.println("medium");
                break;
            case 3:
                System.out.println("high");
                break;
            default:
                System.out.println("abnormal");
        }
    }
}
