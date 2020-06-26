package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer17 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite um número para saber seu fatorial: ");
		int num = scan.nextInt();
		int fatorial = 1;
		for(int i=num;i>0;i--) {
			fatorial= fatorial*i;
		}
		System.out.println("O fatorial de " + num + " é: " + fatorial);
		
	}
}
