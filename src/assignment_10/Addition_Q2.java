package assignment_10;

class Addition{
    public void add(int a,int b){
        System.out.println(a+b);
    }

    public void add(int a,int b,int c){
        int sum = a+b+c;
        System.out.println(sum);
    }
}

class VarargsAddition{
    public int sum(int ...arr){
        int result =0;
        for(int a: arr){
            result +=a;
        }
        return result;
    }
}
public class Addition_Q2 {
    public static void main(String[] args){
        Addition ad = new Addition();
        ad.add(2,9);
        ad.add(3,7,7);
        VarargsAddition varg = new VarargsAddition();
        System.out.println("Vargs sum "+varg.sum(6,7,8));
        System.out.println("Vargs sum "+varg.sum(3,2,7,4,12,8));

    }


}

/*output-11
        17
        Vargs sum 21
        Vargs sum 36*/
