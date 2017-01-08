package Exercises;
/**
 * Exercise 7-5 of think Java, page 101-102.
 * Infinite series expansion problem.
 * 
 * The book begins using factorial as the denominator of the terms, but it is changed to (denom*i)
 * in the loop because it is not as memory intensive as calling the factorial method.
 * 
 * Also, the use of Math.pow is eliminated and instead x is multiplied with itself (using ansX as x)
 * in order to make the equation more efficient.
 * 
 * Also, the first two terms of the equation added together is simply (1 + x/1). 
 * I have added this to the variable ans. This is why the loop begins at 2 (i.e. why i is set to 2).
 * 
 * @author Quan Truong
 *
 */
public class Factorial {

	public static void main(String[] args) {
		System.out.println(gauss(3,2));
		
		System.out.println("Gauss(3,7) equals " + gauss(3,7) + " but does it equal " + (1 - (3*3) + (-1*(387420489/153400)))      );

	}

	/**
	 * 
	 * @param x Double value. The exponent of Euler's number (which is Math.exp).
	 * @param accuracy Integer value. The higher this goes, the higher the accuracy of myexp(x)
	 * to Math.exp(x)
	 * @return Returns variable 'ans'. Double value.
	 */
	
	public static double myexp(double x, int accuracy) {
		System.out.println("No. of terms to be added in the " + "series e ^ " + x + ": " + accuracy);
		// declarations for the loop
		double ansX = x;
		double ans = (1 + x);
		int i = 2;
		double denom = 1;
		while (i <= accuracy) {
			ansX = ansX * x;
			denom = denom * i;
			ans = ans + ansX / denom;
			i = i + 1;
		}
		return ans;
	}
	
	/**
	 * Checks the accuracy of Math.exp(x) and myexp(x).
	 * 
	 * Insert x to check for Math.exp(x) against your myexp(x,90). Once again, accuracy is set to 90.
	 * The numbers will be the same up to .10^14 (which is pretty accurate)
	 * @param x Double value. The exponent of Euler's number to be checked.
	 */
	public static void check(double x) {
		int accuracy = 90;
		System.out.println(x + "\t" + Math.exp(x) + "\t" + myexp(x,accuracy));
	}

	
	/**
	 * This method would have taken erased the 'denom' variable completely, and fact(i) would have
	 * taken its place in the 'ans' variable. 
	 * @param n Integer value. Factorial of n will be returned. 
	 * @return Returns value of 1 if n is 0. Returns factorial of n if n is not equal to 0.
	 */
	public static double factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);

	}
	
	/**
	 * 
	 * @param x Number to be checked
	 * @param accuracy Amount of accuracy
	 * @return double value.
	 */
	public static double gauss(double x, int accuracy) {
		
			System.out.println("No. of terms to be added in the " + "series e ^ " + x + ": " + accuracy);
			// declarations for the loop
			double ansX = x*x;
			double ans = 0;
			double sign = -1;
			int i = 2;
			double denom = 1;
			while (i <= accuracy) {
				sign = sign * -1;
				ansX = ansX * x * x; //x^2...x^4...x^6
				denom = denom * i; //factorial
				ans = ans + sign * ansX / denom;
				i = i + 1;
			}
			//1 - x^2 + ans
			return (1 - (x*x) + ans);
	}

}
