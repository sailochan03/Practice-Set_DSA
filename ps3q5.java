/*Create an abstract class called Shape that contains an abstract method called
calculateVolume(). Implement three concrete classes Cuboid, Cylinder, and Sphere that
extend Shape and implement the calculateVolume() method for each shape.*/

abstract class shape{
    abstract double calculateVolume();
}
class Cuboid extends shape{
    double length;
    double width;
    double height;
    public Cuboid(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }
    double calculateVolume(){
        return length*width*height;
    }
}
class Cylinder extends shape{
    double radius;
    double height;
    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }
    double calculateVolume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
}
class Sphere extends shape{
    double radius;
    public Sphere(double radius){
        this.radius = radius;
    }
    double calculateVolume(){
        return (4/3)*(Math.PI*Math.pow(radius, 3));
    }
}

public class ps3q5 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5, 6, 7);
        System.out.println("Cuboid volume: "+c.calculateVolume());
        Cylinder cy = new Cylinder(7, 10);
        System.out.println("Cylinder volume: "+cy.calculateVolume());
        Sphere s = new Sphere(5);
        System.out.println("Sphere volume: "+s.calculateVolume());
    }
}
