package assisgnment_11;
class animal{
    int leg=0;
    String color="";
    animal(int leg, String col){
        this.leg=leg;
        this.color=col;
    }
}
class dog extends animal{
    dog(int leg,String col){
        super(leg,col);
    }
    public void display(){
        System.out.println(leg +""+color);
    }
}
public class Q1_constructor_chaining {
    public static void main(String[] args) {
        dog d =new dog(4,"Black");
        d.display();
    }
}
