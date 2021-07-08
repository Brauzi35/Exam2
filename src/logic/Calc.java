package logic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		CalcOperations co = new CalcOperations();
		String operation = "start";
		while(operation.equals("default") ||operation.equals("+") || operation.equals("start") || operation.equals("-") || operation.equals("*") || operation.equals("/") || operation.equals("sqrt") || operation.equals("log")) {
			double result= 0.0;
			System.out.print("First define which operation you'd like to make between +, -, *, /, sqrt, log or type off to turn off the calculator");  
			System.out.print("Enter an operation: ");  
			Scanner sc= new Scanner(System.in); //System.in is a standard input stream
			operation = sc.nextLine(); // reads string
			switch(operation) {
			case "+":
				System.out.print("Enter first value: ");  
				double add1 = getDoub();
				System.out.print("Enter second value: ");  
				double add2 = getDoub();
				result = co.sum(add1, add2);
			break;
			case "-":
				System.out.print("Enter first value: ");  
				double sub1 = getDoub();
				System.out.print("Enter second value: ");  
				double sub2 = getDoub();
				result = co.sub(sub1, sub2);
			break;
			case "*":
				System.out.print("Enter first value: ");  
				double mul1 = getDoub();
				System.out.print("Enter second value: ");  
				double mul2 = getDoub();
				result = co.mult(mul1, mul2);
			break;
			case "/":
				System.out.print("Enter first value: ");  
				double div1 = getDoub();
				System.out.print("Enter second value: ");  
				double div2 = getDoub();
				result = co.div(div1, div2);
			break;
			case "sqrt":
				System.out.print("Enter first value: ");  
				double sqrt = getDoub();
				result = co.root(sqrt);
			break;
			case "log":
				System.out.print("Enter first value: ");  
				double log = getDoub();
				result =co.log(log);
			break;
			case "off":
				System.out.print("Turning off the calculator\n");  
			break;
			default:
				System.out.print("Please use a supported operation\n");
				operation = "default";
				result = 0.0;
			}
			if(!operation.equals("off") && !operation.equals("default")) {
				System.out.print("Result :" + result +"\n");  
			}
			
		}
		System.out.print("Goodbye");  
	}

	public static double getDoub() {
		double val = 0.0;
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream
		try {
		val = sc.nextDouble();
		} catch(InputMismatchException e) {
			System.out.println("inserire valori numerici, il valore inserito viene impostato a 0");
		}
		return val;
		
	}
}
