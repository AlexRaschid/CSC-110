
import java.util.*;
import javax.swing.*;


class NumericTypes {
 public static void main (String [] args){
 // TASK #2 Create a Scanner object here
 // (not used for alternate)
 Scanner keyboard = new Scanner(System.in);

//Task 3 code: 	
	


 
 // Identifier declarations
 final int NUMBER = 2 ; // Number of scores
 final int SCORE1 = 100; // First test score
 final int SCORE2 = 95; // Second test score
 final int BOILING_IN_F = 212; // Boiling temperature
 int fToC; // Temperature Celsius
 double average; // Arithmetic average
 String output; // Line of output
//Copyright © 2016 Pearson Education, Inc., Hoboken NJ
 // TASK #2 declare variables used here
 	String firstName;
 	String lastName;
 	String fullName;
 // TASK #3 declare variables used here
 	char firstInitial;
 // TASK #4 declare variables used here
 // Find an arithmetic average.
 average = ((double)(SCORE1 + SCORE2 ) / NUMBER);
 output = SCORE1 + " and " + SCORE2 +
 " have an average of " + average;
 System.out.println(output);
 // Convert Fahrenheit temperature to Celsius.
 fToC = ((BOILING_IN_F - 32) * 5)/9;
 output = BOILING_IN_F + " in Fahrenheit is " +
 fToC + " in Celsius.";
 System.out.println(output);
 System.out.println(); // To leave a blank line
 
 
 
 // ADD LINES FOR TASK #2 HERE
 // Prompt the user for first name
 	System.out.println("Please type in your first name.");
 // Read the user's first name
 	firstName = keyboard.nextLine();
 // Prompt the user for last name
  	System.out.println("Please type in your last name.");
 // Read the user's last name
 	lastName = keyboard.nextLine();
 // Concatenate the user's first and last names
	fullName = (firstName + " " + lastName);
 // Print out the user's full name
	System.out.println("Full name: " + fullName);
 
 

 
 //ADD LINES FOR TASK #2(ALTERNATE) HERE
 //##Note## This Was not here origionaly, so I, added this here for organization.
 
 //Prompt the user for first name in box
 	firstName = JOptionPane.showInputDialog("Enter first name");
 //Prompt the user for last name in box
 	lastName = JOptionPane.showInputDialog("Enter last name");
 //Concatenate both first and last name into fullName.
 	fullName = firstName + " " + lastName;
 //Display a message dialog box with the fullName.
 	JOptionPane.showMessageDialog(null,"Full name " + fullName);
 	System.out.println(); // To leave a blank line
 
 
 
 
 // ADD LINES FOR TASK #3 HERE
 // Get the first character from the user's first name
 	firstInitial = firstName.charAt(0);
 // Print out the user's first initial
 	System.out.println("First Initial: " + firstInitial);
 // Convert the user's full name to uppercase
 	fullName = fullName.toUpperCase();
 // Print out the user's full name in uppercase
	System.out.println("Value of fullName: " + fullName + " |  Length of fullName: " + fullName.length());
 	System.out.println(); // To leave a blank line
 	
 	
 	

 // ADD LINES FOR TASK #4 HERE
 // Prompt the user for a diameter of a sphere
 // Read the diameter
 // Calculate the radius
 // Calculate the volume
 // Print out the volume
 }
}
