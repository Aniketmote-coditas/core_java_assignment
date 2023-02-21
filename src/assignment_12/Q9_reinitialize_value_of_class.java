package assignment_12;
class Employee{
    int empid=0;
    Employee(){
        empid=10;
        System.out.println("before "+ empid);
    }
    Employee(int empid){
        this.empid=empid;
        System.out.println("after "+ empid);
    }
}
public class Q9_reinitialize_value_of_class {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee = new Employee(20);
    }
}
/*
before 10
after 20

 */
