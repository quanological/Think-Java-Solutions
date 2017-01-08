package Exercises;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		char letter = 'x';
		
		//char +/- another char will result in an INT
		System.out.println(letter - 'a');
		
		/*
		 * Create an int[] with 26 values to represent the alphabet
		 * 
		 * use char curChar to represent the indices when assigning it to the histogram
		 * 
		 * return the int[] to the method
		 * 
		 * use Arrays.toString(hist) if you need to print the array
		 */
		
		String alphabet = "ijsadoijaoidj";
		
		System.out.println(Arrays.toString(letterHist(alphabet)));
		
		
		
		
		


	}
	
	public static int[] letterHist(String s) {
		int[] hist = new int[26];
		
		for (int i = 0; i<s.length(); i++) {
			char curChar = s.toLowerCase().charAt(i);
			hist[curChar-'a']++;
		}
		
		return hist;
	}

}
