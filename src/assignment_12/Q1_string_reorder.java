package assignment_12;

public class Q1_string_reorder {
    public static void main(String[] args) {
        String str1 = "aniket";
        String str2 = "mote";

        if(str1.length()<str2.length()){
            System.out.println("small is "+str1);
        }else if(str2.length()<str1.length()){
            System.out.println("small is "+str2);
        }

        if(str1.length()>str2.length()){
            System.out.println("large is "+str1);
        }else if(str2.length()>str1.length()){
            System.out.println("large is "+str2);
        }
    }
}
/*
small is mote
large is aniket

 */