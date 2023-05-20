/*Create a superclass called Employee with two fields, name (String) and salary (double),
and a method getSalary() that returns the salary. Create a subclass called Manager that adds a
field bonus (double) and overrides getSalary() to return the salary and bonus sum. Create
another subclass called Executive that adds a field stockOptions (double) and overrides
getSalary() to return the sum of the salary, bonus, and stock options. Write a method in the
Employee class called printEmployeeInfo() that prints the name, salary, and title ("Employee",
"Manager", or "Executive") of the employee. Implement the appropriate constructors for all
classes.*/

class employee{
    String name;
    double salary;
    public employee(String n, double s){
        salary =s;
        name =n;
    }
    double getSalary(){
        return salary;
    }
    void printEmployeeInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+getSalary());
        System.out.println("Title: Employee");
    }
}
class manager extends employee{
    double bonus;
    public manager(String n, double s, double b){
        super(n, s);
        bonus =b;
    }
    double getSalary(){
        return super.getSalary()+bonus;
    }
    void printEmployeeInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+getSalary());
        System.out.println("Title: Manager");
    }
}
class executive extends manager{
    double stockOptions;
    public executive(String n, double s, double b, double so){
        super(n, s, b);
        stockOptions=so;
    }
    double getSalary(){
        return super.getSalary()+stockOptions;
    }
    void printEmployeeInfo(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+getSalary());
        System.out.println("Title: Executive");
    }
}
public class ps2q5 {
    public static void main(String[] args) {
        employee e = new employee("Sai", 10000);
        e.printEmployeeInfo();
        manager m = new manager("Ashu", 15000, 1000);
        m.printEmployeeInfo();
        executive x = new executive("Sanjeeb", 20000, 2000, 1000);
        x.printEmployeeInfo();
    }
}
