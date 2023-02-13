package asignment_8;

import java.sql.SQLOutput;
import java.util.Scanner;

class Employee{
    int hrs=0;
    int rate=0;
    Employee(){

    }
    Employee(int hrs, int rate){
        this.hrs=hrs;
        this.rate=rate;
    }
    public void computeSalary(){
        int salary = rate*hrs;
        System.out.println("salary is : "+salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hrs=" + hrs +
                ", rate=" + rate +
                '}';
    }
}

class WageEmployee extends Employee{
    WageEmployee(int hrs, int rate){
        super.rate=rate;
        this.hrs=hrs;
        super.computeSalary();
    }

}
class SalesPerson extends WageEmployee{
    int sales=0;
    int commission=0;

    SalesPerson(int hrs,int rate,int sales,int com){
        super(hrs ,rate);
        this.sales=sales;
        this.commission=com;

    }



    @Override
    public void computeSalary() {
        System.out.println("Salary of SalesPerson :: " + (sales*commission + hrs*rate ));
    }
}
class Manager extends Employee{
    String managerName="Arthi";
    int fixedSalary=0;
    int incentive=0;
    Manager(int fixedSalary,int incentive){
        super();
        this.fixedSalary=fixedSalary;
        this.incentive=incentive;
    }

    @Override
    public void computeSalary() {
        System.out.println("Manager Name "+managerName);
        System.out.println("salary of manager "+(fixedSalary+incentive));
    }
}
public class EmployeeInheritance_Q1 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Enter the hrs and rate of employee");
        int hrs = sc.nextInt();
        int rate = sc.nextInt();*/

        //Q1,2,3
        SalesPerson salesPerson = new SalesPerson(10,500,9,90);
        salesPerson.computeSalary();


        //Q3
        Manager manager = new Manager(50000,10000);
        manager.computeSalary();

        //Q4

        Employee [] employees = new Employee[3];
        employees[0]= new Employee(4,400);
        employees[1]= new Employee(6,900);
        employees[2]= new Employee(4,900);
        employees[0].computeSalary();
        employees[1].computeSalary();employees[2].computeSalary();



    }
}
