package se.lexicon.CalculatorSB;

import java.util.Scanner;

public class App 
{
	private static Scanner scan= new Scanner(System.in);
    public static void main( String[] args )
    {
		String input;
		int op=-1;
    	double n1=0,n2=0;
		boolean run=true,isN=true,isV=true,wait=false;
    	
    	System.out.println("Welcome to Calculator!");
    	System.out.println("It works as the simple one.");
		System.out.println("Enter Number or Operations separately.");
    	System.out.println("Enter equal(=) to see the answer.");
		System.out.println("Enter help to see more or off to end.");
    	System.out.println(PrintInt.g(n1));

    	while(run) {
			
    		input=scan.nextLine();
    		isN=isNumber(input);
    		isV=isAvailable(input);
    		
    		if(isN==true) {
    			n2=Double.parseDouble(input);
    			wait=false;

    		}else if(isV==true){
    			op=opGet(input);
    			
    			if(op==-4||op>=1&&op<=4) {
    				wait=true;
    			}
    			
    		}else {
    			System.out.println("Not valid enter.");
    			System.out.println("Enter (help) to see help menu");
    			System.out.println(PrintInt.g(n1));
    		}
    		
    		// counting wait for enter number 2
    		if(!wait) {
    			n1=count(op,n1,n2);
    			if (op==5) {
    				n2=n1;
    			}
    		}
    		
    		//help menu2
    		if(op==-5) {
    			System.out.println("+,-,/,*,c");
    			System.out.println("Text no matter upper or lower case");
    			System.out.println("ADDITION,ADD,SUBTRACTION,DIVISION,MULTIPLICATION");
    			System.out.println("EQUAL,IN SQUARE,CLEAR,OFF,END");
    			System.out.println(PrintInt.g(n1));
    			op=-1;
    		}
    		
    		//help menu1
    		if(op==-4) {
    			System.out.println("Enter Number or Operations separately.");
    			System.out.println("Enter equal(=) to see the answer.");
    			System.out.println("Enter number whitout operations replace the old one.");
    			System.out.println("To all availdable word. Enter help2");
    			System.out.println(PrintInt.g(n1));
    			op=-1;
    		}
    		
    		// end the calculator
    		if(op==-3) {
    			run=false;
    			System.out.println("Goodbye!");
    		}
    		
    		// rest after Enter equal
    		if(op<=0||op==5) {
    			op=-1;
    		};
    		

    	}
    	
    }
    
    //check the enter is valid number or not
    public static boolean isNumber(String s) {
    	boolean re = true;
    	try {
    		Double.parseDouble(s);
    		re = true;
    	}catch(NumberFormatException e) {
    		re=false;
    	}
		return re;
    	
    }
    
    //check the enter is valid string or not
    public static boolean isAvailable(String s) {
    	boolean re=true;
    	String uppS=s.toUpperCase();
    	switch (uppS) {
    	case "+":
    	case "ADDITION":
    	case "ADD":
    		
    	case "-":
    	case "SUBTRACTION":
    		
    	case "/":
    	case "DIVISION":
    		
    	case "*":
    	case "MULTIPLICATION":
    	
    	case "EQUAL":
    	case "=":
    	
    	case "IN SQUARE":
    	
    	case "CLEAR":
    	case "C":
    		
    	case "OFF":
    	case "END":
    	
    	case "HELP":
    	case "HELP2":	
    		re=true;
    		break;
    	default: re=false;
    	}
    	return re;
    }
    
    // get the operation code number
    public static int opGet(String s) {
    	int re=0;
    	String uppS=s.toUpperCase();
    	switch (uppS) {
    	
    	case "HELP2":
    		re=-5;
    		break;
    		
    	case "HELP":
    		re=-4;
    		break;
    		
    	case "OFF":
    	case "END":
    		re=-3;
    		break;

    	case "C":
    	case "CLEAR":
    		re=-2;
    		break;
    	
       	case "EQUAL":
    	case "=":
    		re=0;
    		break;

    	case "+":
    	case "ADDITION":
    	case "ADD":
    		re=1;
    		break;
    		
    	case "-":
    	case "SUBTRACTION":
    		re=2;
    		break;
    		
    	case "*":
    	case "Multiplication":
    		re=3;
    		break;	
    		
    	case "/":
    	case "DIVISION":
    		re=4;
    		break;
    			
    	case "IN SQUARE":
    		re=5;
    		break;

    	default: re=0;
    	}
    	return re;
    }
    
    // use the operation code number to do the counting
    public static double count(int op, double n1, double n2) {
    	switch (op) {
    	case -2:
    		n1=0;
    		System.out.println(PrintInt.g(n1));
    		break;
    		
    //replace the old number if not operation select
    	case -1:
    		n1=n2;
    		break;
    		
    	case 0://=
    		System.out.println(PrintInt.g(n1));
    		break;
    		
    	case 1://+
    		n1+=n2;
    		break;
    		
    	case 2://-
    		n1-=n2;
    		break;
    		
    	case 3://*
    		n1*=n2;
    		break;
    		
    	case 4:///
    		if (n2==0) {
    			System.out.println("Cannot division with 0.");
    			n1=0;
    			System.out.println(PrintInt.g(n1));
    		}else {
    			n1/=n2;
    		}
    		break;
    	case 5:
    		n1*=n1;
    		System.out.println(PrintInt.g(n1));
    		break;
    	default:
    		
    	}
    	return n1;
    }
}
