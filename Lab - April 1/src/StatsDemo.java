//Alexander Raschid
import java.util.Scanner;
// TASK #3 Add the file I/O import statement here
import java.io.*;


/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
*/
public class StatsDemo {
 // TASK #3 Add the throws clause
 public static void main(String[] args) throws IOException {
  double sum = 0; // The sum of the numbers
  int count = 0; // The number of numbers added
  double mean = 0; // The average of the numbers
  double stdDev = 0; // The standard deviation
  String line; // To hold a line from the file
  double difference; // The value and mean difference
  // Create an object of type Scanner
  Scanner keyboard = new Scanner(System.in);
  String filename; // The user input file name
  // Prompt the user and read in the file name
  System.out.println("This program calculates " +
   "statistics on a file " +
   "containing a series of numbers");
  System.out.print("Enter the file name: ");
  filename = keyboard.nextLine();
  // ADD LINES FOR TASK #4 HERE
  // Create a FileReader object passing it the filename
  FileReader file = new FileReader(filename + ".txt");

  // Create a BufferedReader object passing FileReader
  // object

  BufferedReader buffReader = new BufferedReader(file);
  // Perform a priming read to read the first line of
  // the file

  line = buffReader.readLine();


  // Loop until you are at the end of the file
  // Convert the line to a double value and add the
  // value to sum
  // Increment the counter
  // Read a new line from the file

  while (line != null) {
   sum += Double.parseDouble(line);
   count++;
   line = buffReader.readLine();

  }


  // Close the input file

  //Closes buffReader and file

  buffReader.close();
  file.close();


  // Store the calculated mean

  mean = sum / count;




  // ADD LINES FOR TASK #5 HERE
  // Reconnect FileReader object passing it the
  // filename

  FileReader fileTwo = new FileReader(filename);

  // Reconnect BufferedReader object passing
  // FileReader object
  BufferedReader buffReaderTwo = new BufferedReader(fileTwo);

  // Reinitialize the sum of the numbers
  // Reinitialize the number of numbers added
  sum = 0;
  count = 0;
  // Perform a priming read to read the first line of
  // the file

  line = buffReaderTwo.readLine();
  // Loop until you are at the end of the file
  // Convert the line into a double value and
  // subtract the mean
  // Add the square of the difference to the sum
  // Increment the counter
  // Read a new line from the file
  while (line != null) {
   difference = Double.parseDouble(line) - mean;
   sum += Math.pow(difference, 2);
   count++;
   line = buffReaderTwo.readLine();

  }


  // Close the input file
  // Store the calculated standard deviation
  buffReaderTwo.close();
  fileTwo.close();

  stdDev = Math.sqrt(sum / count);

  // ADD LINES FOR TASK #3 HERE
  // Create a FileWriter object using "Results.txt"
  FileWriter writtenFile = new FileWriter("Results.txt");
  // Create a PrintWriter object passing the
  // FileWriter object
  PrintWriter printedFile = new PrintWriter(writtenFile);

  // Print the results to the output file
  printedFile.printf("Mean: %.3f \n Standard Deviation: %.3f", mean, stdDev);
  // Close the output file
 }
}