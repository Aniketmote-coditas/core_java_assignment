package assisgnment_11;
import java.lang.reflect.Method;
import java.util.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

class Employee{
    private int empId=0;
    private String  empName="";
    Employee(int empid, String empName){
        this.empId=empid;
        this.empName=empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}
public class Q3_private_var_reflection {
    public static void main(String[] args) {
        try{
        Employee employee = new Employee(1, "aarthi");
        Field privateMethod = Employee.class.getDeclaredField("empId");
        privateMethod.setAccessible(true);
        int empid = (int)privateMethod.get(employee);
        System.out.println("after using reflrction empid " + empid);

        Field privateField1
                = Employee.class.getDeclaredField("empName");
        privateField1.setAccessible(true);
        String empNmae = (String)privateField1.get(employee);
        System.out.println("after using reflrction empName " + empNmae);
    }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
