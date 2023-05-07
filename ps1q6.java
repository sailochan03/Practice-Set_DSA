/*Create an "Employee" class with a constructor that includes the employee's name,
salary, position, and department. The class should have methods for setting and getting
these attributes, as well as a method for giving the employee a raise based on their
position. */

class employee
{
    String name, dept, posn;
    double salary;

    employee(String n, String p, String d, double s)
    {
        name = n;
        posn =p;
        dept = d;
        salary = s;
    }

    String getName()
    {
        return name;
    }
    void setName(String n)
    {
        name = n;
    }
    String getPosn()
    {
        return posn;
    }
    void setPosn(String p)
    {
        posn = p;
    }
    String getDept()
    {
        return dept;
    }
    void setDept(String d)
    {
        dept = d;
    }
    double getSal()
    {
        return salary;
    }
    void setSal(double s)
    {
        salary =s;
    }
    
    void raise()
    {
        if (posn.equals("manager"))
        salary = salary*1.5;
        else if (posn.equals("ass.manager"))
        salary = salary*1.3;
        else 
        salary = salary*1.1;
    }

}

public class ps1q6 
{
    public static void main(String[] args) 
    {
        employee e1 = new employee("Eren Yeager", "manager", "HR", 50000.0);
        employee e2 = new employee("Reiner Braun", "ass.manager", "IT", 45000.0);
        employee e3 = new employee("Mikasa Ackerman", "head", "Security", 40000.0);

        System.out.print("\nEmployee 1: \n");
        System.out.println("Name: "+e1.getName()+"\nDepartment: "+e1.getDept()
        +"\nPosition: "+e1.getPosn()+"\nSalary: "+e1.getSal());
        e1.raise();
        System.out.println("Employee 1 New salary: "+e1.getSal());

        System.out.print("\nEmployee 2: \n");
        System.out.println("Name: "+e2.getName()+"\nDepartment: "+e2.getDept()
        +"\nPosition: "+e2.getPosn()+"\nSalary: "+e2.getSal());
        e2.raise();
        System.out.println("Employee 2 New salary: "+e2.getSal());
        
        System.out.print("\nEmployee 3: \n");
        System.out.println("Name: "+e3.getName()+"\nDepartment: "+e3.getDept()
        +"\nPosition: "+e3.getPosn()+"\nSalary: "+e3.getSal());
        e3.raise();        
        System.out.println("Employee 3 New salary: "+e3.getSal());

    
    }
    
}
