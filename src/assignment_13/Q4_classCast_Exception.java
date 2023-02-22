package assignment_13;
class EmployeeParent{
    int id=0;
    EmployeeParent(int id){
        this.id= id;
    }
}
class EmployeeChild extends EmployeeParent{
    EmployeeChild(int id){
        super(id);
        this.id=id;
    }
}
public class Q4_classCast_Exception {
    public static void main(String[] args) {
        EmployeeParent employeeParent = new EmployeeParent(45);
        try{
            EmployeeChild employeeChild = (EmployeeChild)employeeParent;
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
