package com.exercise2.bren.baga;

public class Palindrome {

	// 300726788 - Bren Baga
	// Exercise2
	public static void main(String[] args) {
		
		String s = "a";		
		System.out.println("s ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "aa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "ax";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "xa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));		
		
		s = "axa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "axxa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));		
		
		s = "bxxa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));		
		
		s = "ayxa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "axya";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "axxb";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "axYxa";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "racecar";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));
		
		s = "raceecar";		
		System.out.println("\ns ==> " + s);
		System.out.println("isPalindrome(s) ==>  " + isPalindrome(s));		
		
		
		

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
