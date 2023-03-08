package assignment_16;
import assignment_16.package2.Student;
public class Question1_PackageAggregation {
    public static void main(String[] args) {
        Student employee = new Student();
        employee.id = 1;
        employee.name = "Aniket";
    }


    
}
/*
import Assignment16_Package_InnerClass.Package1.Address;
we need to import package and respective class if we are using aggregation in different class.
and need to use public modifiers
 */