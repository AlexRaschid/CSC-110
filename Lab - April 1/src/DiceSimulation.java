//Alexadner Raschid

import java.util.Random; // Needed for the Random class
/**
 This class simulates rolling a pair of dice 10,000 times
 and counts the number of times doubles of are rolled for
 each different pair of doubles.
*/
public class DiceSimulation
{
 public static void main(String[] args)
 {
 final int NUMBER = 10000; // Number of dice rolls
 // A random number generator used in
 // simulating the rolling of dice
 Random generator = new Random();
 int die1Value; // Value of the first die
 int die2Value; // Value of the second die
 int count = 0; // Total number of dice rolls
 int snakeEyes = 0; // Number of snake eyes rolls
 int twos = 0; // Number of double two rolls
 int threes = 0; // Number of double three rolls
 int fours = 0; // Number of double four rolls
 int fives = 0; // Number of double five rolls
 int sixes = 0; // Number of double six rolls
 // TASK #1 Enter your code for the algorithm here
 // Display the results

 /**This is the while loop*/
 /**To test the other loops, just comment/uncomment this whole loop out.*/
// while(count < NUMBER){
//
//	//I added the count here instead of the bottom to make it realistic ouput
//	//For example, you have get snakeEyes at the 0 roll
//	//Increments the # of times the dice is rolled
// 	count++;
//
//	 die1Value = generator.nextInt(6) + 1;
//	 die2Value = generator.nextInt(6) + 1;
//	 
//	 if(die1Value == 1 && die1Value == die2Value){
//		 snakeEyes++;
//		 
//		 System.out.println ("You rolled snake eyes " +
//		 snakeEyes + " out of " +
//		count + " rolls."); 
//	 }else if(die1Value == 2 && die1Value == die2Value){
//		 twos++;
//		 
//		 System.out.println ("You rolled double twos " +
//		 twos + " out of " + count +
//		" rolls.");	 
//	 }else if(die1Value == 3 && die1Value == die2Value){
//		 threes++;
//		 
//		 System.out.println ("You rolled double threes " +
//		 threes + " out of " + count +
//		" rolls.");	
//	 }else if(die1Value == 4 && die1Value == die2Value){
//		 fours++;
//		 
//		 System.out.println ("You rolled double fours " +
//		 fours + " out of " + count +
//		" rolls.");	 
//	 }else if(die1Value == 5 && die1Value == die2Value){
//		 fives++;
//		 
//		 System.out.println ("You rolled double fives " +
//		 fives + " out of " + count +
//		 " rolls.");	 
//	 }else if(die1Value == 6 && die1Value == die2Value){
//		 sixes++;
//		 
//		 System.out.println ("You rolled double sixes " +
//		 sixes + " out of " + count +
//		" rolls.");
//	 }
//	 
//	 
//	 
//
// }
 
 /**This is the do while loop*/
 /**To test the other loops, just comment/uncomment this whole loop out.*/
// 	do{
// 		//Refference while loop for why I put count here
// 		//Increments the # of times the dice is rolled
// 		 count++;	
// 			
//	 die1Value = generator.nextInt(6) + 1;
//	 die2Value = generator.nextInt(6) + 1;
//	 
//	 if(die1Value == 1 && die1Value == die2Value){
//		 snakeEyes++;
//		 
//		 System.out.println ("You rolled snake eyes " +
//		 snakeEyes + " out of " +
//		count + " rolls."); 
//	 }else if(die1Value == 2 && die1Value == die2Value){
//		 twos++;
//		 
//		 System.out.println ("You rolled double twos " +
//		 twos + " out of " + count +
//		" rolls.");	 
//	 }else if(die1Value == 3 && die1Value == die2Value){
//		 threes++;
//		 
//		 System.out.println ("You rolled double threes " +
//		 threes + " out of " + count +
//		" rolls.");	
//	 }else if(die1Value == 4 && die1Value == die2Value){
//		 fours++;
//		 
//		 System.out.println ("You rolled double fours " +
//		 fours + " out of " + count +
//		" rolls.");	 
//	 }else if(die1Value == 5 && die1Value == die2Value){
//		 fives++;
//		 
//		 System.out.println ("You rolled double fives " +
//		 fives + " out of " + count +
//		 " rolls.");	 
//	 }else if(die1Value == 6 && die1Value == die2Value){
//		 sixes++;
//		 
//		 System.out.println ("You rolled double sixes " +
//		 sixes + " out of " + count +
//		" rolls.");
//	 }
//	 
//	 
//	 
//
// }while(count < NUMBER);
 
 
 //I set count to one so it would be realistic output.
 /**This is the for loop*/
 /**To test the other loops, just comment/uncomment this whole loop out.*/
// for(count = 1; count <= NUMBER; count++){
// 		
//	 die1Value = generator.nextInt(6) + 1;
//	 die2Value = generator.nextInt(6) + 1;
//
//	 if(die1Value == 1 && die1Value == die2Value){
//		 snakeEyes++;
//
//		 System.out.println ("You rolled snake eyes " +
//		 snakeEyes + " out of " +
//		count + " rolls."); 
//	 }else if(die1Value == 2 && die1Value == die2Value){
//		 twos++;
//		 
//		 System.out.println ("You rolled double twos " +
//		 twos + " out of " + count +
//		" rolls.");	 
//	 }else if(die1Value == 3 && die1Value == die2Value){
//		 threes++;
//		 
//		 System.out.println ("You rolled double threes " +
//		 threes + " out of " + count +
//		" rolls.");	
//	 }else if(die1Value == 4 && die1Value == die2Value){
//		 fours++;
//		 
//		 System.out.println ("You rolled double fours " +
//		 fours + " out of " + count +
//		" rolls.");	 
//	 }else if(die1Value == 5 && die1Value == die2Value){
//		 fives++;
//		 
//		 System.out.println ("You rolled double fives " +
//		 fives + " out of " + count +
//		 " rolls.");	 
//	 }else if(die1Value == 6 && die1Value == die2Value){
//		 sixes++;
//		 
//		 System.out.println ("You rolled double sixes " +
//		 sixes + " out of " + count +
//		" rolls.");
//	 }
//	 
//	 
//	 
//
// }
 
 
 
 
 
 
 

 }
}
