//Alexander Raschid
import java.util.Scanner;
public class calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		double answer;
		
		System.out.println("Enter a value for x");
		double x = console.nextDouble();
		
		
		System.out.println("Enter a value for y");
		double y = console.nextDouble();
		
		System.out.println("Enter the character you want to use (+, -, *, /, %)");
		char opperator = console.next().charAt(0);
		
		//Call proper methods
		//The two if statements handle the numerator and denominator 
		if(opperator == '/'){
			
			System.out.println("State your numerator, x or y? (The Denominator will be the one not chosen)");
				char numerator = console.next().charAt(0);
			
				switch (numerator){
					case 'x':
						answer = div(x,y);
						System.out.println(x + " / " + y + " = " + answer);
						break;
					case 'y':
						answer = div(y,x);
						System.out.println(y + " / " + x + " = " + answer);
						break;
					
				}
		}if(opperator == '%'){
			
			System.out.println("State your numerator, x or y? (The Denominator will be the one not chosen)");
				char numerator = console.next().charAt(0);
			
				switch (numerator){
					case 'x':
						answer = mod(x,y);
						System.out.println(x + " % " + y + " = " + answer);
						break;
					case 'y':
						answer = mod(y,x);
						System.out.println(y + " % " + x + " = " + answer);
						break;
					
				}

		}if(opperator == '-'){
			
			System.out.println("Which number is being subtracted?(x or y)");
				char numerator = console.next().charAt(0);
			
				
				switch (numerator){
					case 'x':
						answer = sub(x,y);
						System.out.println(x + " - " + y + " = " + answer);
						break;
					case 'y':
						answer = sub(y,x);
						System.out.println(y + " - " + x + " = " + answer);
						break;
					
				}

		}
		
		
		//Switch handels + and *
		
		switch (opperator){
			case '+':
				answer = add(x,y);
				System.out.println(x + " + " + y + " = " + answer);
				break;
			case '*':
				answer = times(x,y);
				System.out.println(x + " * " + y + " = " + answer);
				break;
		
		}
		
		
	}
	
	
	
	
	
	
	
	
	public static double add(double x, double y){
		return x + y;
	}
	
	public static double sub(double x, double y){
			return x - y;
	}
	
	public static double times(double x, double y){
		return x * y;
	}
	
	public static double div(double x, double y){
		//x is numerator
		//y is denominator
		return (x/y);
		
	}
	
	public static double mod(double x, double y){
		//x is numerator
		//y is denominator
		return x % y;
	}

}
