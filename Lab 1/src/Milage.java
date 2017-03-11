//Imports scanner
import java.util.*;
public class Milage {

	public static void main(String[] args) {
		//Initializes scanner
		Scanner console = new Scanner(System.in);
		//Informs users of program's function
		System.out.println("This program will calculate mileage");
		//Asks for mileage
		System.out.println("Type in the miles driven.");
		//captures input
		double miles = console.nextDouble();
		//Asks for gallons used
		System.out.println("Type in the gallons of fuel used.");
		//captures input
		double gallons = console.nextDouble();
		//caculates the Miles per Gallon
		double mpg = miles / gallons;
		
		//Prints the calculated Miles per Gallon
		System.out.println("Your miles per gallon is: " + mpg);
		
	}

}
