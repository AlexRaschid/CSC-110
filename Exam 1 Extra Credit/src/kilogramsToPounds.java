//Alexander Raschid
import javax.swing.JOptionPane;
public class kilogramsToPounds{
	
	public static void main(String[] args) {
		final double POUNDS_CONSTANT = 2.205;
		
		String s = JOptionPane.showInputDialog(null, "Enter a weight(kg)");
		double weight = Double.parseDouble(s);
		
		double converted = POUNDS_CONSTANT * weight;
		
		JOptionPane.showMessageDialog(null,  "Converted to lb = " + converted);
		
		
	}

}
