package se.lexicon.CalculatorSB;

public class PrintInt {
	public static String g(double n) {
		String s = "";
		if ((n * 10) % 10 == 0) {
			s = "" + (int) n;
		} else {
			s = "" + n;
		}
		return s;
	}

}
