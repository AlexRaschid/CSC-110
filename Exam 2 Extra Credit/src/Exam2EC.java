import java.io.*;
import java.util.*;
public class Exam2EC {
	public static void main(String[] args) throws IOException{
		int num = 0;
		int nonNum = 0;
		int dec = 0;
		
		PrintWriter pw = new PrintWriter("celcius.txt");
		File f = new File("fahrenheit.txt");
		Scanner file = new Scanner(f);
		
		while(file.hasNext()){
			for(int i = 0; i < file.nextLine().length(); i++){
				
				if(Character.isDigit(file.nextLine().charAt(i)) ||
					file.nextLine().charAt(i) == '.'){
					
					pw.println((Double.parseDouble(file.nextLine())) - 3 / 1.8);
					num++;	
				} else{
					nonNum++;
				}
			}
		}
		pw.flush();
		pw.close();
		System.out.println("Total # of entries: " + (num + nonNum));	
	}
}
