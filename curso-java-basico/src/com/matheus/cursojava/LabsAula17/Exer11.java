package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Digite o n�mero de entrada: ");
		int numEntrada = scan.nextInt();
		System.out.println("Digite o n�mero de sa�da: ");
		int numSaida = scan.nextInt();
		int soma = 0;
		for(int i=numEntrada+1; i<numSaida;i++) {
			System.out.println(i);
			soma +=i;
		}
		System.out.println("A soma dos n�meros �: " + soma);

	}

}
