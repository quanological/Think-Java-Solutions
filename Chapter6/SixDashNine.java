
import java.util.Scanner;

public class SixDashNine {
	public static void main(String[] args) {

		// Ask for user input
		double x;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a double number: ");
		x = in.nextDouble();
		System.out.println("Enter an integer number: ");
		n = in.nextInt();
		in.close();

		System.out.println(Power(x, n));
	}

	public static double Power(double x, int n) {
		//Base case: If n is equal to 0 return 1. 
		if (n == 0) {
			return 1;
			//if n is greater than 0, perform function
		} else if (n > 0) {
			return x * Power(x, n - 1);
			
		} else if (n % 2 == 0){
			//If n is even, then this line is more efficient
			return Math.pow(Math.pow(x, n/2),2);
			
		}
		else {
			//if n is smaller than 0, inverse the function.
			return 1.0 / x * Power(1.0 / x, -n - 1);
		}
		
		
	}
}
