package sample.Quiz3;
import java.util.Scanner;
public class QuizThree {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of values you're entering (Up to 50 values may be entered).");
        int size = keyboard.nextInt();
        if (size > 50) {
            System.out.println("Please enter less than 50 values!");
        }
        int[] entry = new int[size - 1];

        System.out.println("Enter " + (entry.length + 1) + " values: ");

        for (int j = 0; j < size; j++) {
            entry[j] = keyboard.nextInt(); }

    }

    public void Asc() {
        System.out.println("The values you entered listed from lowest to highest are: ");
        if (entry[j] < entry[j + 1]) {
            entry[j] = entry[j + 1]; }

        for (j=0;j<size;j++) {
            System.out.println("Index: " + entry[j]); }
    }

    public void Des() {
        System.out.println("The values you entered listed from highest to lowest are: ");
        if (entry[j] > entry[j + 1]) {
            entry[j] = entry[j + 1]; }

        for (j=0;j<size;j++) {
            System.out.println("Index: " + entry[j]); }
    }

}

