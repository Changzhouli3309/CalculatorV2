package se.lexicon.CalculatorSB;

public class PrintInt {
	public static String g(double n) {
		String s = "0";
		String a = "";
		if((n*10)%10==0) {
			s = "0"+(int)n;
		}else {
			s = "0"+n;
		}
		for (int i=1;i<s.length();i++) {
			a+=s.charAt(i);
		}
		
		return a;
	}

}
