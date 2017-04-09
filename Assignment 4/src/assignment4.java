//Alexander Raschid
import java.util.Scanner;
public class assignment4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int input;
		
		do{
			System.out.println("Select an action:");
			System.out.println("\t1.Lowercase");
			System.out.println("\t2.Uppercase");
			System.out.println("\t3.Exit");
			input = console.nextInt();
			
		}while(input == 1 ||
				input == 2 ||
				input == 3);
		
		
		
	}

}
