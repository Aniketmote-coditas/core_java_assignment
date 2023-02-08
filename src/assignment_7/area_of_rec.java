package assignment_7;
class Area{
    public int result, length, breadth;

    public int getResult() {
        return getLength()*getBreadth();
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
public class area_of_rec {
    public static void main(String [] args){
        Area area =new Area();
        area.setBreadth(10);
        area.setLength(9);
        //area.setResult(area.getBreadth()* area.getLength());
        System.out.println(area.getResult());

    }
}
/*
90
 */
