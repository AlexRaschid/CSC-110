//Alexander Raschid
import java.io.*;
import java.util.*;
public class Assignment6 {

	public static void main(String[] args) throws IOException{
		
		File file = new File("input.txt");
		Scanner inputFile = new Scanner(file);
		
		//current line string
		String currentLn;
		
		//dot is decimal
		int dot;
		
		
		//While loop checks for an available next line
		while(inputFile.hasNextLine()){	
			
			//sets the current line to the next available line 
			currentLn = inputFile.nextLine();
			dot = 0;
			
			
			//loops through each index of that line
			for(int i = 0; i < currentLn.length(); i++){
				
				//Checks if the current character is a letter, not a decimal
				//Terminates loop instantly 
				if(Character.isLetter(currentLn.charAt(i)) && 
					currentLn.charAt(i) != '.'){
					 System.out.println(currentLn + " is not numeric");
					 
					 break;
				}
				
				
				//checks for either double or not numeric
				//Allows access to if statement if currently a dot or a dot has pre-existed
				if(currentLn.charAt(i) == '.' || dot >= 1){
					
					//Checks if the current index is a dot again
					//to update the variable.
					if(currentLn.charAt(i) == '.'){
						dot++;
					}

					 //Checks if more than one dot and at the end of the line
					 if(dot >= 2 && i == currentLn.length()-1){
						 System.out.println(currentLn + " is not numeric");

						//Checks if only one dot and at end of line  
					 } else if(dot == 1 && i == currentLn.length()-1 ){
						 System.out.println(currentLn + " is a double");
					 }

					 //checks if an int
				}else if(dot == 0 && i == currentLn.length()-1){	
					System.out.println(currentLn + " is an integer");
				}

			}
		}
		
		//Closes the file scan since no more lines are available.
		inputFile.close();
		
		
		
		
	}
	
	
}
