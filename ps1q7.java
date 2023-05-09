/*Create a class called "Book" with a constructor that includes the title, author,
publication year, and the number of book pages. The class should have methods for
setting and getting these attributes and a method for checking if the book is longer than
another book. */

class book
{
    String title, author;
    int year, pages;

    public book(String title,String author, int year, int pages)
    {
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return year;
    }

    public void setPublicationYear(int year) {
        this.year = year;
    }

    public int getNumPages() {
        return pages;
    }

    public void setNumPages(int pages) {
        this.pages = pages;
    }
    public boolean isLongerThan(book w) {
        return this.pages > w.pages;
    }

    public String year() {
        return null;
    }

    public String pages() {
        return null;
    }

}
public class ps1q7 
{
    public static void main(String[] args) 
    {
     book b1 = new book("The Alchemist", "Paulo Coelho", 1988, 163);
     book b2 = new book("Sherlock Holmes", "Arthur Conan Doyle", 1892, 307);

     System.out.println("BOOK 1:");
     System.out.println("Book Name: "+b1.title+"\nAuthor: "+b1.author+
     "\nYear of Publication: "+b1.year+"\nNo. of pages: "+b1.pages);
     System.out.println("");

     System.out.println("BOOK 2:");
     System.out.println("Book Name: "+b2.title+"\nAuthor: "+b2.author+
     "\nYear of Publication: "+b2.year+"\nNo. of pages: "+b2.pages);
     System.out.println("");

     if(b1.pages > b2.pages)
     System.out.println("Book 1 has more pages.");
     else 
     System.out.println("Book 2 has more pages.");
     
    }
    
}
