/*Write a Java program to print the area of a rectangle by creating a class named 'Area'
having two methods. The first method, named 'setDim' takes the length and breadth of
the rectangle as parameters, and the second method, named 'getArea', returns the area
of the rectangle. The length and breadth of the rectangle are entered through the
keyboard. */

import java.util.Scanner;
class area
{
    int length;
    int width;

    public void setDim(int l, int w)
    {
        length = l;
        width = w;
    }
    public int getArea()
    {
        return length*width;
    }
}

public class ps1q1
{
    public static void main(String[] args) 
    {
      Scanner scan = new Scanner(System.in);
      area a1 = new area();
    
     System.out.println("Enter length: ");
     a1.length= scan.nextInt();
     System.out.println("Enter width: ");
     a1.width = scan.nextInt();

     a1.setDim(a1.length, a1.width);

     System.out.println("Area: "+a1.getArea());
    }   
}