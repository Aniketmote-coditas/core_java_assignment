package assignment_9;
abstract class shape{
    public abstract void area();
}
class circle extends shape{

    @Override
    public void area() {
        System.out.println("area of circle");

    }
}
class square extends shape{

    @Override
    public void area() {
        System.out.println("Area of square");
    }
}
class cylinder extends circle{

    @Override
    public void area() {
        super.area();
        System.out.println("Area of cylinder");
    }
}
class rectangle extends square{

    @Override
    public void area() {
        super.area();
        System.out.println("Area of rectangle");
    }
}
public class abstact_class_shap_Q4 {
    public static void  main(String [] args){
        cylinder cy = new cylinder();
        cy.area();
        rectangle re = new rectangle();
        re.area();
    }
}
