package logic;


public class CalcOperations {

	public double sum(double add1, double add2)  {
		//simple sum
		
		double result;
		result = add1 + add2;
		
		return result;
		
	}
	
	public double sub(double val1, double val2) {
		//simple sub
		
		double result;
		result = val1 - val2;
		
		return result;
		
	}
	
	public double mult(double val1, double val2) {
		//simple sub
		
		double result;
		result = val1*val2;
		
		return result;
		
	}
	
	public double div(double val1, double val2) {
		//simple sub
		
		double result;
		result = val1/val2;
		
		return result;
		
	}
	
	public double root(double val1) {
		//square root
		
		double result;
		result = Math.sqrt(val1);
		
		return result;
		
	}
	
	public double log(double val1) {
		//log10
		double result;
		result = Math.log10(val1);
		return result;
	}
}
