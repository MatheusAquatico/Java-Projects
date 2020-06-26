package com.matheus.cursojava.LabsAula35;

public class Fibonacci {
	
	public static int verificarFib (int n) {
		if (n==1) {
			return 0;
		}else if (n==2) {
			return 1;
		}else {
			return verificarFib(n-1)+ verificarFib(n-2);
		}
	}

}
