/*Create an abstract class Employee with a non-abstract method calculateSalary(),
which will calculate an employee's salary. Implement two concrete classes Manager and
Engineer, that extend Employee. The Manager class should have an additional field
called a bonus, which will be added to the salary, while the Engineer class should have a
field called overtimeHours, which will be used to calculate the overtime pay. Override the
calculateSalary() method for each class to reflect these differences.*/

abstract class employee{
    String name;
    int baseSalary;
    public employee(String n, int b){
        name =n;
        baseSalary = b;
    }
    int calculateSalary(){
        return baseSalary;
    }
}
class manager extends employee{
    int bonus;
    public manager(String n, int b, int bonus){
        super(n, b);
        this.bonus = bonus;
    }
    int calculateSalary(){
        return super.calculateSalary()+bonus;
    }
}
class engineer extends employee{
    int overtimeHours;
    int overtimePay;
    public engineer(String n, int b, int oh, int op){
        super(n, b);
        overtimeHours =oh;
        overtimePay =op;        
    }
    int calculateSalary(){
        return super.calculateSalary()+(overtimeHours*overtimePay);
    }
}

public class ps3q4 {
    public static void main(String[] args) {
        manager m = new manager("SAI", 10000, 1000);
        System.out.println("Manager salary: "+m.calculateSalary());
        engineer e = new engineer("SAI", 10000, 5, 500);
        System.out.println("Engineer salary: "+e.calculateSalary());    
    }
}
