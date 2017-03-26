//Alexander Raschid
import java.util.Scanner;
public class LoopPractice {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		
		System.out.println("Please put in two numbers");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		
		//Print all numbers 
		if(num1 < num2)
			numberRange(num1,num2);
		else
			numberRange(num2,num1);
		
	}
	
	
	public static void numberRange(int num1 , int num2){
		//forloop
		System.out.println("The final return for all loop types should list the numbers between " + num1 + " and " + num2 + " Inclusive");
		System.out.println();
		System.out.println("ForLoop:");
		for(int i = num1; i <= num2; i++){
			System.out.println(i);
		}
		//A space to seperate console output
		System.out.println();
		System.out.println("While-Loop:");		
		
		//While Loop
		int x = num1;
		while(x <= num2){
			System.out.println(x);
			x++;
		}
		
		//A space to seperate console output
		System.out.println();
		System.out.println("Do-While-Loop:");
		
		//Do-While loop
		int y = num1;
		do{
			System.out.println(y);
		}while(++y <= num2);
		
		
	}
	
	
	
	
	

}
