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
i.e. We should be able to reuse this same method in JOptionPane user interface. - 10pts */
/* Create another class using JOptionPane interface to prompt the user for login and
password and return appropriate messages. This class will use the authenticaion method
from the previous class. - 5pts */

package sample;
import javax.swing.*;
public class Account {

    public String StoredUname; // Creates a username and password which is then stored.
    public String StoredPword; // The Auth[entication] method will check the user's input against
    // the stored U[ser]name and Password.

    public void Acc() { // User default constructor method, before an account is created.
        StoredUname = "None Entered";
        StoredPword = "None Entered"; }

    public void Acc(String newUser, String passWord) { // User method for account creation.
        StoredUname = newUser;
        StoredPword = passWord; }

    public void Auth(String LoginUname, String LoginPword) {
      { if (LoginUname.equalsIgnoreCase(StoredUname) && LoginPword.equals(StoredPword)) {
            JOptionPane.showMessageDialog(null, "Thank you.\nWelcome " + StoredUname + "!"); }
        else JOptionPane.showMessageDialog(null, "Incorrect Username or Password."); } }

} // Written by Jennifer Holder (CSC 201 Annandale M/W)