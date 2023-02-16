package assignment_10;
class Shape{
    public float calculateArea(int radius) {


        return (float) (2*3.14*radius);
    }

    public float calculateArea(float radius) {


        return 3*radius;
    }
    public int calculateArea(int length,int breadth) {

        int area = length*breadth;
        return area;
    }
    public float calculateArea(int length, int height,int sides) {


        float area = 2*(length*height*sides);
        return area;
    }

}

class circle extends Shape{
    public float calculateArea(int radius) {


        return (float) (2*3.14*radius);
    }

}
class rectangle extends Shape{
    public int calculateArea(int length,int breadth) {

         int area = length*breadth;
        return area;
    }
}
public class shape_Q1 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.calculateArea(7));
        System.out.println(shape.calculateArea(9.8f));
        System.out.println(shape.calculateArea(8,9));
        System.out.println(shape.calculateArea(6,8,4));


        circle c = new circle();
        System.out.println(c.calculateArea(4));

        rectangle r = new rectangle();
        r.calculateArea(13,14);

    }
}
/*43.96
29.400002
72
384.0
25.12
*/