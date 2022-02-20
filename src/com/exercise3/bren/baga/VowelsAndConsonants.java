package com.exercise3.bren.baga;

import java.util.Scanner;

public class VowelsAndConsonants {
	
	

	// 300726788 - Bren Baga
	// Exercise3
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		
		// Repeatedly ask user for a string.
		while (true) {
			
			System.out.print("\nEnter a string or 'quit' to exit: ");
			String s = reader.next();
			
			if (s.equals("quit")) {
				System.out.println("Bye!");
				break;
			}
			
			boolean hasMoreVowelsThanConsonants = checkMoreVowelsThanConsonants(s) >= 1 ? true : false;
			String log = String.format("hasMoreVowelsThanConsonants? ==> %s", hasMoreVowelsThanConsonants);
			System.out.println(log);
		}
		
		reader.close();
		
	}
	
	
	
	
	/**
	 * 
	 * @param s: The string.
	 * @return 
	 * 		-1: If there are more consonants than vowels.
	 * 		0: If there are equal consonants and vowels.
	 * 		+1: If there are more vowels than consonants.
	 */
	public static int checkMoreVowelsThanConsonants(String s) {
		
		int strLength = s.length();		
		
		if (strLength == 0) {
			return 0;
		}
		
		
		if (strLength == 1) {
			if (isVowel(s.charAt(0))) {				
				return 1;				
			}
			if (isConsonant(s.charAt(0))) {				
				return -1;				
			}
			return 0;
		}
		
		
		// Strlength is greater than 1.
		String substr = s.substring(1);
		
		if (isVowel(s.charAt(0))) {			
			return 1 + checkMoreVowelsThanConsonants(substr);		
		}
		if (isConsonant(s.charAt(0))) {				
			return -1 + checkMoreVowelsThanConsonants(substr);				
		}		
		return 0 + checkMoreVowelsThanConsonants(substr);

	}
	
	
	
	

	private static boolean isConsonant(char c) {
		char[] letters = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };
		
		for (char l : letters) {
			if (Character.toLowerCase(c) == l) {
				return true;
			}
		}

		return false;
	}
	
	

	private static boolean isVowel(char c) {

		char[] letters = { 'a', 'e', 'i', 'o', 'u' };
		
		for (char l : letters) {
			if (Character.toLowerCase(c) == l) {
				return true;
			}
		}

		return false;
	}

}
