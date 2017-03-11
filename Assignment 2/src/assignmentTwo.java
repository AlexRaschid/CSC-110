//Code Written by Alexander E. Raschid


import java.util.*;
import javax.swing.*;


public class assignmentTwo {

	public static void main(String[] args) {
		//New Scanner
		Scanner console = new Scanner(System.in);
		//Asks for input and stores input in userInput
		System.out.println("Type in something");
		String userInput = console.nextLine();
		
		//Finds the 2nd s value
		int secondS = findSAgain(userInput);
		//Finds the 10 letters after mid
		//String tenLettersAfterMid = firstTenAfterMid(userInput);

		
		//The message dialog
		JOptionPane.showMessageDialog(null,"Information:\n" +
		"Line entered: " + userInput + "\n" +
		"UpperCase: " + userInput.toUpperCase() + "\n"+
		"Lowercase: " + userInput.toLowerCase() + "\n"+
		"Length: " + userInput.length() + "\n" +
		"First Letter: " + userInput.charAt(0) + "\n" +
		"Last Letter: " + userInput.charAt(userInput.length()-1) + "\n"+
		"First index of \"s\": " + userInput.indexOf('s') + " (If -1, then there is no 1nd, s)" + "\n" +
		"Second index of \"s\": " + secondS  + " (If -1, then there is no 2nd, s)\n" +
		"10 Characters starting : " + userInput.substring((userInput.length()/2), ((userInput.length()/2) + 10)));
			
	}
	
	
	//Find the 2nd s value
	public static int findSAgain(String userInput) {
		//Loops through the string
		for(int i = 0; i < userInput.length(); i++){
			//Makes sure that the s value detected is not
			//The first s value
			if(userInput.charAt(i) == 's' && userInput.indexOf('s') != i){
				//returns the 2nd s index value
				return i;	
			}
		}
		
		// if no value detected, return -1
		return -1;
	}
	
	
	
//	//Attempts at finding 10 characters after mid char
//	//By starting in middle and increments only 10 values.
//	
//	public static String firstTenAfterMid(String userInput){
//		String tenLetters = "";
//		//By starting in middle, thats why i is equal to about half the string length,
//		//and increments only 10 values, since it starts in mid but only goes up
//		// 10 more.
//		for(int i = (userInput.length()/2); i < (userInput.length()/2)+10; i++){
//			//Updating the String variable
//			tenLetters += userInput.charAt(i);
//		}
//		
//		//returning the string.
//		return tenLetters;
//		
//		
//		
//		
//	}
	
	
	
	


}
