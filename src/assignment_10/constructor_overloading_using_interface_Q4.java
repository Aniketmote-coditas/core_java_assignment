package assignment_10;

class Rectangle1  implements shaps{
    int l=0,b=0;
    Rectangle1(){

    }
    Rectangle1(int l,int b){
        this.l=l;
        this.b=b;
    }
    @Override
    public void getArea() {
        System.out.println("Area is : "+l*b);
    }

}

class Triangle1 implements shaps{
    int base,height;
    Triangle1(){
        base=0;
        height=0;
    }
    Triangle1(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public void getArea() {
        System.out.println("Area is : "+height*base/2);
    }
}
public class constructor_overloading_using_interface_Q4 {
    public static void main(String[] args) {
        shaps rectangle = new Rectangle1(6,7);
        rectangle.getArea();
        shaps triangle = new Triangle1(4,5);
        triangle.getArea();
    }
}
/*
Area is : 42
Area is : 10

 */
