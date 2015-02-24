package Assignments.Book;
public class Book {

    String Title, Author; int NoP;

    public Book () {
        Title = "None";
        Author = "None";
        NoP = 0; }

    public Book (String newA, String newT, int newN) {
        Author = newA;
        Title = newT;
        NoP = newN; }

    public String toString() {
       return "Title: " + Title + "\nAuthor: " + Author + "\nNumber of Pages: " + NoP; } }
