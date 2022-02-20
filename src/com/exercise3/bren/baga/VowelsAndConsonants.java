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
	 * This returns the difference of number of vowels vs consonants.
	 * For ex: String s = "abc" has 1 vowel and 2 consonants. Thus this
	 * will return 1 - 2 = -1.
	 * 
	 * @param s: The string.
	 * @return 
	 * 		Negative number: If there are more consonants than vowels.
	 * 		0: If there are equal consonants and vowels.
	 * 		Positive number: If there are more vowels than consonants.
	 */
	public static int checkMoreVowelsThanConsonants(String s) {
		
		int strLength = s.length();		
		
		if (strLength == 0) {
			return 0;
		}
		
		
		/* Base Case: If strLength is 1. */
		char ch = s.charAt(0);
		
		if (strLength == 1) {
			if (isVowel(ch)) {				
				return 1;				
			}
			if (isConsonant(ch)) {				
				return -1;				
			}
			// If char is neither a vowel nor a consonant.
			return 0;
		}
		
		
		/* StrLength is greater than 1. */
		String substr = s.substring(1);
		
		if (isVowel(ch)) {			
			return 1 + checkMoreVowelsThanConsonants(substr);		
		}
		if (isConsonant(ch)) {				
			return -1 + checkMoreVowelsThanConsonants(substr);				
		}		
		// If char is neither a vowel nor a consonant.
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
