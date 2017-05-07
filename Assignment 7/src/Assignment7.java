
public class Assignment7 {

	public static void main(String[] args) {
		String s1;
		String s2;
		System.out.println("##########################################################");
		System.out.println("Test 1");
		System.out.println("##########################################################");
		s1 = "9A";
		if (isInt(s1))
			System.out.println(s1 + " is an int");
		else
			System.out.println(s1 + " is NOT an int");
		s1 = "99";
		s2 = "12";
		if (isInt(s1)) {
			System.out.println(s1 + " is an int");
			if (isInt(s2)) {
				System.out.println(s2 + " is an int");
				int x = toInt(s1);
				int y = toInt(s2);
				System.out.println("sum: " + (sumInt(x, y)));
			}
		}
		System.out.println("##########################################################");
		System.out.println("Test 2");
		System.out.println("##########################################################");
		s1 = "1.1.3";
		if (isDouble(s1))
			System.out.println(s1 + " is a double");
		else
			System.out.println(s1 + " is NOT a double");
		s1 = "12.34";
		s2 = "56.78";
		if (isDouble(s1)) {
			System.out.println(s1 + " is a double");
			if (isDouble(s2)) {
				System.out.println(s2 + " is a double");
				double x = toDouble(s1);
				double y = toDouble(s2);
				System.out.println("sum: " + (sumDouble(x, y)));
			}
		}
	}

	public static boolean isInt(String s) {
		if (s.length() == 0) {
			return false;
		}
		int numInts = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numInts++;
			}
		}
		if (s.length() == numInts) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isDouble(String s) {
		if (s.length() == 0) {
			return false;
		}

		int numInts = 0;
		int numDec = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				numInts++;

			} else if (s.charAt(i) == '.') {
				numDec++;
			}
		}
		if (s.length() == (numInts + numDec) && numDec == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static int toInt(String s) {
		if (!isInt(s)) {
			return 0;
		} else {
			int num = Integer.parseInt(s);
			return num;
		}
	}

	public static double toDouble(String s) {
		if (!isDouble(s)) {
			return 0;
		} else {
			double num = Double.parseDouble(s);
			return num;
		}
	}

	public static int sumInt(int x, int y) {
		return x + y;
	}

	public static double sumDouble(double x, double y) {
		return x + y;
	}

}
