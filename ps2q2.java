/*Create a superclass called Shape with two fields, height and width, and a method getArea()
that returns the shape's area. Create a subclass called Rectangle that adds a method
getPerimeter() that returns the perimeter of the rectangle. Implement the appropriate
constructors for both classes */

class shape{
    double height;
    double width;

    public shape(double h, double w){
        width = w;
        height =h;
    }
    public double getArea(){
        return width*height;
    }
}
class rectangle extends shape
{
    public rectangle(double h, double w) {
        super(h, w);
    }
    double getPerimeter(){
        return 2*(height+width);
    }
}
public class ps2q2 
{
    public static void main(String[] args) {
        
        rectangle r = new rectangle(4, 5);
        System.out.println("Area: "+r.getArea());
        System.out.println("Perimeter: "+r.getPerimeter());
    }
    
}
