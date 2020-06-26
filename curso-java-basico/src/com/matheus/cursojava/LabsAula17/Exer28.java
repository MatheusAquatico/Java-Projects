package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer28 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		boolean primo = true;
		do{
			primo = true;
		System.out.println("Digite um número inteiro: ");
		
		int num = scan.nextInt();
		for (int i =2;i<num;i++) {
			if(num%i==0) {
				primo = false;
				
			}
		}
		
		if (primo) {
			System.out.println("Seu número é primo!");
		}
		else {
			System.out.println("Seu número não é primo!");
		}
		}while(!primo);
		
	}
}
