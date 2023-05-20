/*Create a superclass called Vehicle with two fields (Instance variables), make (String) and
model (String). Create a subclass called Car that adds a field numDoors. Implement the
appropriate constructors for both classes.*/

import java.util.Scanner;
class Vehicle
{
    String make;
    String model;
    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
    }
}
class car extends Vehicle
{
    int numDoors;
    public car(String make, String model, int n)
    {
        super(make, model);
        numDoors=n;
    }
}
public class ps2q1 
{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Enter Company: ");
        String N = scan.next();
        System.out.println("Enter the model of the car: ");
        String m = scan.next();
        System.out.println("Enter number of doors: ");
        int d = scan.nextInt();
        car c= new car(N, m, d);
        System.out.println(N+" "+m+" "+d);

    }
    
}
