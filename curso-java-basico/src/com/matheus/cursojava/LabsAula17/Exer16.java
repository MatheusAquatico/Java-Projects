package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		
		int fib1 = 1;
		int fib2 = 1;
		int fib;
			System.out.println(fib1);
			System.out.println(fib2);
			do {
				 fib = fib1+ fib2;
				System.out.println(fib);
				fib1=fib2;
				fib2=fib;
				
			}while(fib<=500);
		}


	}


