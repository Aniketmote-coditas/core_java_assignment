package assignment_7;
class Login{
    private String user_name;
    private String user_surname;
    private String user_address;
    private int user_age;
    private int user_account;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_surname() {
        return user_surname;
    }

    public void setUser_surname(String user_surname) {
        this.user_surname = user_surname;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public int getUser_account() {
        return user_account;
    }

    public void setUser_account(int user_account) {
        this.user_account = user_account;
    }
}
class Employee{
    private int employee_id;
    private String employee_name;
    private int employee_age;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public int getEmployee_age() {
        return employee_age;
    }

    public void setEmployee_age(int employee_age) {
        this.employee_age = employee_age;
    }
}
class Transaction{
    private int amount;
    public int credit(int n){
        return amount+n;
    }
    public int debit(int n){
        return amount-n;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
public class Encapsulation_Bank_system {
    public static void main(String [] args){
        Login login = new Login();
        login.setUser_name("Aniket");
        login.setUser_surname("mote");
        login.setUser_account(7517339);
        login.setUser_address("pune");

        Employee employee = new Employee();
        employee.setEmployee_id(1);
        employee.setEmployee_age(23);
        employee.setEmployee_name("Ravi");

        Transaction transaction = new Transaction();
        transaction.setAmount(1000);
        System.out.println("credited with "+ transaction.credit(200));
        System.out.println("debited with "+ transaction.debit(500));
    }
}
