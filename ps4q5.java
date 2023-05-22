/*Create an interface named Playable with a method play() that
takes no arguments and returns void. Create two classes, Guitar and
Drums, that implement the Playable interface and provide their own
implementation for the play() method. Then create a class named Band
that implements both the Movable and Playable interfaces.*/

interface Playable{
    void play();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("Guitar play");
    }
}
class Drums implements Playable{
    public void play(){
        System.out.println("Drums play");
    }
}

public class ps4q5 {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        g.play();
        Drums d = new Drums();
        d.play();
    }
}
