
public class PrintAmerican {
	
	public static void printAmerican( int date, String month, int year) {
		System.out.println("American Format:");
		System.out.println(month + " " + date + ", " + year);
		System.out.println();
		
	}
	
	public static void printEuropean( int date, String month, int year){
		System.out.println("The date in EU format: ");
		System.out.println((date) + " " + month + " " + year);
		System.out.println();
	}
	
	public static void main(String[] args) {
		printAmerican(19, "December", 2016);
		printEuropean(23, "Whenever", 1962);
		
	}
	
	
	
//	String day = "Thursday";
//	String month = "July";
//	int date = 16;
//	int year = 2016;
	
}
