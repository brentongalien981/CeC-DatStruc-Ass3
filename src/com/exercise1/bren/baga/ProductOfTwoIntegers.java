package com.exercise1.bren.baga;

public class ProductOfTwoIntegers {

	// 300726788 - Bren Baga
	// Exercise1
	public static void main(String[] args) {

		int maxM = 10;
		int maxN = 10;
		
		// Show products for i * j.
		for (int i = 0; i < maxM; i++) {
			
			for (int j = 0; j < maxN; j++) {
				
				int p = getProduct(i, j);
				String log = String.format("getProduct(%s, %s) ==> %s", i, j, p);
				System.out.println(log);
			}
		}
	}

	
	
	public static int getProduct(int m, int n) {
		if (n == 0) {
			return 0;
		} else {
			return m + getProduct(m, n - 1);
		}

	}

}
