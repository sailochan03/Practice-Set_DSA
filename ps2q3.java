/*Create a superclass called Animal with the method makeSound(). Create a subclass called
Dog that overrides makeSound() to print "Woof!". Create another subclass called Cat that
overrides makeSound() to print "Meow!". Write a main method that creates an instance of each
subclass and calls their makeSound() methods*/
class Animal{
    void makeSound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    //@Override
    void makeSound(){
        System.out.println("Woof!");
    }
}
class Cat extends Animal{
    //@Override
    void makeSound(){
        System.out.println("Meow!");
    }
}
public class ps2q3 {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
        Dog d = new Dog();
        d.makeSound();
        Cat c = new Cat();
        c.makeSound();
    }
}
