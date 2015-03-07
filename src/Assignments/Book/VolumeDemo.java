package Assignments.Book;
import java.util.Scanner;
public class VolumeDemo {

    public static void main(String[] args) {

    System.out.println("Enter the amount of books in your volume: ")
    Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();

        String[] Book = new String[size];
    while (size != 0) {
        for (i = 0; i < size; i++) {
            Book newBook = new Book[i] = keyboard.next();
        } } }
