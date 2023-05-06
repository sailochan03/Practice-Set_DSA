/* Create a "Song" class with a constructor that includes the song's title, artist, and
duration. The class should have methods for setting and getting these attributes and a
method for playing the song. */

class song
{
    String title, artist;
    double duration;
    
    void song_details(String t, String a, double d)
    {
        title = t;
        artist = a;
        duration = d;
    }

    void display_song()
    {
        System.out.println("Song: "+title+"\nArtist: "+artist+"\nDuration: "+duration+" min");
    }
}

public class ps1q4 
{
    public static void main(String[] args) 
    {
        song s = new song();

        s.song_details("Starboy", "The Weeknd", 3.50);

        s.display_song();
    
    }
    
}
