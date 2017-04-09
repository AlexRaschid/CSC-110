//Alexander Raschid
import java.util.Scanner;
public class Assignment4 {

	public static void main(String[] args){
		
		Scanner console = new Scanner(System.in);
		int choice;
		
		do{
			
			System.out.println("Select an option:");
			System.out.println("\t1.Lowercase");
			System.out.println("\t2.Uppercase");
			System.out.println("\t3.Exit");
			System.out.println("Enter selection: ");
			
			choice = console.nextInt();

			
			if(choice == 1){
				//Prints lower case alphebet
				for(int i = 'a'; i <= 'z'; i++ )
					System.out.println("\t" + (char)i + " = " + i);
				System.out.println();
			    
			}else if(choice == 2){
				//Loops through upper case alphebet
				//Letter represented as a int so make loop easier
				//Converts the letter A to an int
				int letter = (int)'A';
				
				//Has the letter range from A to Z
				while(letter <= 'Z'){
					System.out.println("\t" + (char)letter + " = " + letter);
					
					letter++;
				}
				
				System.out.println();
				
				//Exits the main while loop.
			}else if(choice == 3){
				break;
				
			}

		}while(true);
		
		
	}
	
	
	
}
