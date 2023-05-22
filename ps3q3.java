/*Create an abstract class called Person with an abstract method called introduce().
Implement two concrete classes, Student and Teacher, that extend Person and implement
the introduce() method to print out a message introducing themselves, including their
name and occupation.*/

abstract class person{
    String name;
    String occupation;
    public person(String n, String o){
        name =n;
        occupation =o;
    }
    abstract void introduce();
}
class student extends person{
    public student(String n, String o){
        super(n, o);
    }
    void introduce(){
        System.out.println("My name is "+name+". I am a "+occupation);
    }
}
class teacher extends person{
    public teacher(String n, String o){
        super(n, o);
    }
    void introduce(){
        System.out.println("My name is "+name+". I am a "+occupation);
    }
}
public class ps3q3 {
    public static void main(String[] args) {
        student s = new student("Sai", "Student");
        s.introduce();
        teacher t = new teacher("Arjun", "Teacher");
        t.introduce();
    }
    
}
