package Assignments.Book;
import java.util.Scanner;
public class VolumeDemo {

    public static void main(String[] args) {

        Book b1 = new Book("Douglas Adams", "The Hitchhiker's Guide to the Galaxy", 1026);
        Book b2 = new Book("Matthew Ashford", "What I Learned in Economics", 120);

        Volume volume1 = new Volume("Volume 1", 2);

        volume1.getBookArray();
        System.out.println(volume1.toString());

        } } }
