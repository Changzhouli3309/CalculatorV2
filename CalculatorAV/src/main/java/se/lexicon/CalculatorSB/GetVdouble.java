package se.lexicon.CalculatorSB;

import java.util.Scanner;
//Check the string is number or not, until you get a valid number
public class GetVdouble {
	private static Scanner scan= new Scanner(System.in);
	
	public static double getVD() {
    	boolean valid = false;
    	double number = 0;
    	while(!valid) {
    		try {
        		number = Double.parseDouble(scan.nextLine());
        		valid = true;
        	}catch(NumberFormatException e) {
        		System.out.println("You did not enter a valid number");
        	}
    	}
    	return number;    	
    }
}
