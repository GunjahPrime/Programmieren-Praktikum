package uebungsblatt4;
/**
 * 
 * Class for basic arithmetic operations.
 *
 */
public class MathFunctions {

	
	/**
	 * Division
	 * 
	 */
	public static int divide(int dividend, int divisor) {
		int quotient = dividend / divisor;
		return quotient;
	}
	
	public static double divide(double dividend, double divisor) {
		double quotient = dividend / divisor;
		return quotient;
	}
	
	/**
	 * Addition
	 * 
	 */
	public static int add(int addent1, int addent2) {
		int sum = addent1 + addent2;
		return sum;
	}
	
	public static double add(double addent1, double addent2) {
		double sum = addent1 + addent2;
		return sum;
	}
	
	/**
	 * Subtraction
	 * returns the difference between two numbers
	 * 
	 */
	public static int substract(int minuend, int subtrahend) {
		int difference = minuend - subtrahend;
		return difference;
	}
	
	public static double substract(double minuend, double subtrahend) {
		double difference = minuend - subtrahend;
		return difference;
	}
	
	
	/**
	 * Multiplication
	 * 
	 */
	public static int multiply(int multiplicand, int multiplier) {
		int product = multiplicand * multiplier;
		return product;
	}
	public static double multiply(double multiplicand, double multiplier) {
		double product = multiplicand * multiplier;
		return product;
	}
	
}
