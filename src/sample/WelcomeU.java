/* Write an authentication appliation to prompt the user for
username and password and return "Welcome username!" when the
user provided correct username and password. Otherwise, the
application will return "Wrong username or password!" message. */

// Use Scanner to read from keyboard input
// Use System.out to display the messages
// Create at least one authentication method to use in main method - 4pts
// Use appropriate type for authentication method
// Use appropriate parameters for authentication method if necessary

/* Design a method in the way that you can reuse this method in different classes.
The key is to design a method that supports different user interfaces.
i.e. We should be able to reuse this same method in JOptionPane user interface. - 10pts

Create another class using JOptionPane interface to prompt the user for login and
password and return appropriate messages. This class will use the authenticaion method
from the previous class. - 5pts */

package sample;
import javax.swing.*;
import java.util.Scanner;
public class WelcomeU {

public static void main(String[] args) {

    String nUserName; // n[ew]
    String nPWord;
    String lname;
    String lword;

// This creates the account's password and username...
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please create a login.\n* Username is not case sensitive, but your password is.");
    System.out.println("Enter Username:");
        nUserName = keyboard.next();
        System.out.println("Enter Password:");
        nPWord = keyboard.next();

Account newUser = new Account(); // Creates object newUser of the Account class.
newUser.Acc(nUserName, nPWord); // Defines Acc[ount] parameters for object newUser.

// The user is then asked to login with their created account parameters...
    lname = JOptionPane.showInputDialog(null, "Please login.\nEnter Username: "); // Here JOptionPane is used.
    lword = JOptionPane.showInputDialog(null, "Enter Password: ");

// The authorization method then runs using the login information entered...
    newUser.Auth(lname, lword);

System.exit(0); } } // Written by Jennifer Holder (CSC 201 Annandale M/W)