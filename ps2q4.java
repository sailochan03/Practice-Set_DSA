/*Create a superclass called Person with two fields, name and age, and a method introduce()
that prints "Hi, my name is [name], and I am [age] years old." Create a subclass called Student
that adds a field major and overrides introduce() to print "Hi, my name is [name], I am [age]
years old, and I am majoring in [major]." Implement the appropriate constructors for both
classes.*/

class person{
    String name;
    int age;
    public person(String n, int a){
        name =n;
        age =a;
    }
    void introduce(){
        System.out.println("Hi, my name is "+name+", and I am "+age+" years old.");
    }
}
class Student extends person{
    String major;
    public Student(String n, int a, String m){
        super(n, a);
        major =m;
    }
    void introduce(){
        System.out.println("Hi, my name is "+name+", and I am "+age+" years old, and I am majoring in "+major);
    }
}
public class ps2q4 {
    public static void main(String[] args) {
        person p = new person("Sai", 19);
        p.introduce();
        Student s = new Student("Sai", 19, "CS");
        s.introduce();
    }
}
