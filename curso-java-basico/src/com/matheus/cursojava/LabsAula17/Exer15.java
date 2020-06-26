package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int fib1 = 1;
		int fib2 = 1;
		System.out.println("Você quer calcular fibonacci até que termo?: ");
		int termo = scan.nextInt();
		if (termo <3) {
			if (termo ==1) {
				System.out.println(fib1);
			}else if (termo==2){
				System.out.println(fib1);
				System.out.println(fib2);
			}
		}else {
			System.out.println(fib1);
			System.out.println(fib2);
			for (int i = 3;i <= termo; i++) {
				int fib = fib1+ fib2;
				System.out.println(fib);
				fib1=fib2;
				fib2=fib;
			}
		}

	}

}
