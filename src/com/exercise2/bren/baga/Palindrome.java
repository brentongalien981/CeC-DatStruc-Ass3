package com.exercise2.bren.baga;

import java.util.Scanner;

public class Palindrome {

	// 300726788 - Bren Baga
	// Exercise2
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
			
			String log = String.format("Is '%s' a palindrome? ==> %s", s, isPalindrome(s));
			System.out.println(log);
		}
		
		reader.close();
				
	}
	
	
	
	public static boolean isPalindrome(String s) {
		
		// Consider empty string is also a palindrome.
		if (s.length() == 0) {
			return true;
		}
		
		int lastCharIndex = s.length() - 1;		
		
		
		if (s.charAt(0) == s.charAt(lastCharIndex)) {
			
			if (s.length() <= 3) {
				return true;
			}
			
			String newSubstr = s.substring(1, lastCharIndex);
			return isPalindrome(newSubstr);
		}
		
		return false;
	}

}
