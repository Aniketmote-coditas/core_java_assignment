package assisgnment_11;
class AddOfNum{
    AddOfNum(int n1, int n2,int n3){
        int result = n1+n2+n3;
        System.out.println("sum is "+ result);
    }
}
public class Q4_parameterized_method {
    public static void main(String[] args) {
        AddOfNum add = new AddOfNum(9,9,9);
    }
}
