/*Create an interface named Vehicle with two methods, start() and
stop(), that both return void. Create two classes that implement the
Vehicle interface: Car and Bicycle. Each class should provide its own
implementation for the start() and stop() methods.*/

interface Vehicle{
    void start();
    void stop();
}
class car implements Vehicle{
    public void start(){
        System.out.println("Car start");
    }
    public void stop(){
        System.out.println("Car stops");
    }
}
class Bicycle implements Vehicle{
    public void start(){
        System.out.println("Bicycle starts");
    }
    public void stop(){
        System.out.println("Bicycle stops");
    }
}

public class ps4q3 {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
        Bicycle b = new Bicycle();
        b.start();
        b.stop();
    }
}
