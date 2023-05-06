/* Create a class called "Time" with a constructor that takes the hour, minute, and
second. The class should have methods for setting and getting these attributes and a
method for displaying the time in a 12-hour format. */

class time
{
    int hour, min, sec;

    void input_time(int h, int m, int s)
    {
        hour = h;
        min = m;
        sec = s;
    }

    void display_time()
    {
        System.out.println(hour+":"+min+":"+sec);
    }

}

public class ps1q3 
{ 
    public static void main(String[] args) 
    {
        time t1 = new time();

        t1.input_time(4, 34, 56);

        t1.display_time();
        
    }
    
}
