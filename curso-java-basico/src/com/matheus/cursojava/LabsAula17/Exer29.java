package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer29 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		boolean primo = true;
		System.out.println("Digite um número inteiro: ");
		int num = scan.nextInt();
		System.out.println(1);
		for(int i =2;i<=num;i++) {
			primo = true;
			for(int j =2 ; j<=i;j++) {
				if (i%j==0&&i!=j) {
					primo =false;
				}
				
			}
			if(primo) {
				System.out.println(i);

			}
		}
}}
