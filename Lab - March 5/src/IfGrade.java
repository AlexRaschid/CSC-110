//Alexander Rashchid
import java.util.*;
public class IfGrade {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter your grade, an integer");
		int score = console.nextInt();
		char grade;
		
		
		if(score < 60){
			grade = 'F';
			
			
		}else if(score<70){
			grade = 'D';
			
			
		}else if(score<80){
			grade = 'C';
			
			
		}else if(score<90){
			grade = 'B';
			
			
		}else if(score<=100){
			grade = 'A';
			
			
		}else{
			grade = 'X';
			
			
		}
		
		System.out.println("Grade: " + grade);
		
	}

}
