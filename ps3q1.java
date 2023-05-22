/*Create an abstract class called Vehicle with an abstract method called startEngine().
Implement two concrete classes, Car and Motorcycle, that extend Vehicle and implement
the startEngine() method to print out a message saying the engine has started for each
vehicle.*/

abstract class vehicle{
    public abstract void startEngine();
}
class car extends vehicle{
    public void startEngine(){
        System.out.println("Car engine starting.");
    }
}
class motorcycle extends vehicle{
    public void startEngine(){
        System.out.println("Motorcycle engine starting.");
    }
}
public class ps3q1 {
    public static void main(String[] args) {
        car c = new car();
        c.startEngine();
        motorcycle m = new motorcycle();
        m.startEngine();
    }
    
}
