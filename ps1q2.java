/* Create a class called "Rectangle" with a constructor that takes in the length and
width of the rectangle. The class should have methods for calculating the area and
perimeter of the rectangle */

import java.util.Scanner;
class rectangle
{
    int length;
    int width;

    void input()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = scan.nextInt();
        System.out.println("Enter width: ");
        width = scan.nextInt();

    }

    public int perimeter(int length, int width)
    {
        return 2*(length+width);
    }

    public int area1(int length, int width)
    {
        return length*width;
    }
}

public class ps1q2 
{
    public static void main(String[] args) 
    {
      rectangle r1 = new rectangle();

      r1.input();

      System.out.println("Area: "+r1.area1(r1.length, r1.width));
      System.out.println("Perimeter: "+r1.perimeter(r1.length, r1.width));

    }

}
