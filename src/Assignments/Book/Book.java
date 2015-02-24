package Assignments.Book;
public class Book {

    String Title, Author; int NoP;

// Constructor and toString() Methods:

    public Book () {
        Title = "None";
        Author = "None";
        NoP = 0; }

    public Book (String newAuthor, String newTitle, int newNoP) {
        Author = newAuthor;
        Title = newTitle;
        NoP = newNoP; }

    public String toString() {
       return "Title: " + Title + "\nAuthor: " + Author + "\nNumber of Pages: " + NoP; } }
