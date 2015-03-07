package Assignments.Book;
public class Book {

    String title, author; int numberOfPages;

    public Book() {
        this("none", "none", 0); }

    public Book(String newA, String newT, int newN) {
        title = newA;
        author = newT;
        numberOfPages = newN; }

    public String toString() {
       return "Title: " + title + "\nAuthor: " + author + "\nNumber of Pages: " + numberOfPages; } }
