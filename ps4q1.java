/*Define an interface named Shape with a method getArea() that
returns a double. Create two classes that implement the Shape interface:
Circle and Rectangle. The Circle class should take a radius in its
constructor, and the Rectangle class should take a width and height.*/

interface shape{
    public double getArea();
}
class circle implements shape{
    double radius;
    public circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
class rectangle implements shape{
    double length; 
    double width;
    public rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(){
        return length*width;
    }
}
public class ps4q1 {
    public static void main(String[] args) {
        circle c = new circle(5);
        System.out.println("Circle area: "+c.getArea());
        rectangle r = new rectangle(5, 6);
        System.out.println("Rectangle area: "+r.getArea());
    }
}
