/*Define an interface named Animal with two methods, eat() and
sleep() that both return void. Create two classes that implement the
Animal interface: Cat and Dog. Each class should provide its own
implementation for the eat() and sleep() methods */

interface Animal{
    void eat();
    void sleep();
}
class Cat implements Animal{
    public void eat(){
        System.out.println("Cat eats");
    }
    public void sleep(){
        System.out.println("Cat sleeps");
    }
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Dog eats");
    }
    public void sleep(){
        System.out.println("Dog sleeps");
    }
}

public class ps4q4 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        c.sleep();
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}
