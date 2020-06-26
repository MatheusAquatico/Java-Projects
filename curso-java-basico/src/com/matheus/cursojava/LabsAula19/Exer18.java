package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer18 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int [] arrayInt = new int [10];
		int menorIdade = 1000000000;
		int menorIdadePosicao = 0;
		int maiorIdade = 0;
		int maiorIdadePosicao = 0;
		for (int i =0;i<arrayInt.length;i++) {
			System.out.println("Digite a idade da pessoa " + (i+1));
			int idade = scan.nextInt();
			arrayInt [i] = idade;
			if(idade<menorIdade) {
				menorIdade = idade;
				menorIdadePosicao = i+1;
			}else if(idade > maiorIdade) {
				maiorIdade = idade;
				maiorIdadePosicao = i+1;
			}
		}
		System.out.println("Menor idade: " + menorIdade);
		System.out.println("Na posição: " + menorIdadePosicao);
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Na posição: " + maiorIdadePosicao);
	}
}
