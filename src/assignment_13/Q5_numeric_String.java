package assignment_13;

public class Q5_numeric_String {
    public static void main(String[] args) {
        int [] array = {1,1,1,1,1,1,1,1,1,1};
        int sum=0;
        try {
            for (int i = 0; i < 11; i++) {
                sum = sum + array[i];
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("please enter the value under 10");
        }
        System.out.println(sum);
    }
}
