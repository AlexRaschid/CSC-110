//Alexander Raschid
import java.util.Scanner;
public class LengthOfCirclesArch {
		public static void main(String[] args){
			Scanner console = new Scanner(System.in);
			//gets pi value
			System.out.println("Enter a value for PI");
			double pI = console.nextDouble();
			
			//Gets Diameter
			System.out.println("Enter a value for the Diameter");
			
			double diameter = console.nextDouble();
			
			//gets radius
			double radius = diameter / 2;
			
			//gets angle
			System.out.println("Enter a value for an angle");
			double angle = console.nextDouble();
			
			//calculates length
			double areaLength = ((2 * pI)* radius * (angle/360));
			System.out.print("pI: " + pI + "\n" +
								"Radius: " + radius + "\n" +
								"Angle: " + angle + "\n" +
								"Arch: " + areaLength);
			
			
			
		}
}
