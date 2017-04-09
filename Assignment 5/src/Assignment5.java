//Alexander Raschid	
import java.util.Scanner;
import java.io.*;
public class Assignment5 {

	public static void main(String[] args) throws IOException {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a filename");
		String fName = console.nextLine();
		
		
		File file = new File(fName);
		
		
		while(file.exists() == false){

			if(fName.equals("exit")){
				System.exit(0);
			
			}if(!file.exists()){
				System.out.println("Invalid File Name");
			}
				
			
			System.out.println("Enter a filename");
			fName = console.nextLine();	
			
		}	
		
		System.out.print("Enter a search term: ");
		String searchTerm = console.next();
		
		console.close();
		
		
		Scanner fileScanner = new Scanner(fName);
		
		int wordCount = 0;
		int termCount = 0;
		while(fileScanner.hasNext()){
			String word = fileScanner.next();
			wordCount++;
			if(word.equalsIgnoreCase(searchTerm))
				termCount++;
			
		}
		
		PrintWriter result = new PrintWriter("result.txt");

		result.println("Input File: " + file.getAbsolutePath());
		result.println("There are " + wordCount + "words in the file");
		result.println("The string \"" + searchTerm + "\" appears " + termCount + " times");

		
		}
	}
