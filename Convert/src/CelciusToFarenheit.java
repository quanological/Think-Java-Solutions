
import java.util.Scanner;

public class CelciusToFarenheit {

	public static void main(String[] args) {
		double celcius, farenheit, output, equation1;
		equation1 = 1.8;
		Scanner in = new Scanner(System.in);
		
		//Ask user for input
		System.out.println("How cold is it in Celcius?");
		celcius = in.nextDouble();
		
		//Convert to Farenheit
		farenheit = celcius * equation1 + 32;
		
		System.out.println(farenheit);
		
	}
}
