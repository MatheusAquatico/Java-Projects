package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Sua turma � de quantas pessoas?");
		int pessoas = scan.nextInt();
		int somatorioIdade=0;
		for(int i = pessoas; i>0;i--) {
			System.out.println("Digite a idade: ");
			int idade = scan.nextInt();
			somatorioIdade+=idade;
		}
		double mediaIdade = somatorioIdade/pessoas;
		if(mediaIdade >0 && mediaIdade <=25) {
			System.out.println("Sua turma tem a m�dia de " + mediaIdade + " anos e � considerada jovem");

		}else if (mediaIdade >25 && mediaIdade <=60){
			System.out.println("Sua turma tem a m�dia de " + mediaIdade + " anos e � considerada adulta");
		}else {
			System.out.println("Sua turma tem a m�dia de " + mediaIdade + " anos e � considerada idosa");
		}
	}

}
