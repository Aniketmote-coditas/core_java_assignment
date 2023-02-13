package assignment_9;

import asignment_8.EmployeeInheritance_Q1;

abstract class Vehical{
    public abstract void engine();
}
class Car extends Vehical{

    @Override
    public void engine() {
        System.out.println("car has a good engine");
    }
}
class Truck extends Vehical{

    @Override
    public void engine() {
        System.out.println("truck has a bad engine");
    }
}

public class abstract_class_Q1 {
    public static void main(String [] args){
        Car car=new Car();
        car.engine();
        Truck truck = new Truck();
        truck.engine();


    }
}
