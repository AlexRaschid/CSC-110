import java.util.*;
import javax.swing.*;


public class assignmentTwo {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Type in something");
		String userInput = console.nextLine();
		
		int firstS = userInput.indexOf('s');
		int secondS = findSecondS(userInput, firstS);
		
		JOptionPane.showMessageDialog(null,"Information:\n" +
		"Line entered: " + userInput + "\n" +
		"UpperCase: " + userInput.toUpperCase() + "\n"+
		"Lowercase: " + userInput.toLowerCase() + "\n"+
		"Length: " + userInput.length() + "\n" +
		"First Letter: " + userInput.charAt(0) + "\n" +
		"Last Letter: " + userInput.charAt(userInput.length()-1) + "\n"+
		"First index of \"s\": " + firstS + "\n" +
		"Second index of \"s\": " + secondS + " (If -1, then there is no 2nd s)\n" +
		" ");
			
	}
	
	
	public static int findSecondS(String userInput, int firstS){
		String userInputLower = userInput.toLowerCase();
		for(int i = 0; i < userInput.length(); i++){
			if(userInputLower.indexOf(i) == 's' && userInputLower.indexOf(i) != firstS){
				return userInputLower.indexOf(i);
			}
		}
		
		while(firstS != -1){
			
			
		}
			return -1;
		
		
	}
	
	


}
