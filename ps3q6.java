/*Create an abstract class called Animal with an abstract method called move().
Implement three concrete classes, Fish, Bird, and Dog, that extend Animal and
implement each animal's move() method. The Fish class should print out a message
saying it is swimming; the Bird class should print out a message saying it is flying, and
the Dog class should print out a message saying it is running.*/

abstract class animal{
    abstract void move();
}
class fish extends animal{
    void move(){
        System.out.println("Fish is swimming.");
    }
}
class bird extends animal{
    void move(){
        System.out.println("Bird is flying.");
    }
}
class dog extends animal{
    void move(){
        System.out.println("Dog is running.");
    }
}
public class ps3q6 {
    public static void main(String[] args) {
        fish f = new fish();
        f.move();
        bird b = new bird();
        b.move();
        dog d = new dog();
        d.move();
    }
}
