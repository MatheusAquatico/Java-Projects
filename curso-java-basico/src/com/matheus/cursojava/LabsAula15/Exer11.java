package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Este programa vai calcular o reajuste para o funcionário indicado");
		System.out.println("Digite o salário a ser reajustado: ");
		double salario = scan.nextDouble();
		double novoSalario;
		
		if (salario <=280) {
			novoSalario = salario*1.2;
			System.out.println("Salário antigo: "+ salario);
			System.out.println("Percentual do aumento aplicado: 20% ");
			System.out.println("Valor do aumento: " + (novoSalario - salario));
			System.out.println("Novo salário: " +  novoSalario);
		}else if (salario > 280 && salario <=700) {
			novoSalario = salario*1.15;
			System.out.println("Salário antigo: "+ salario);
			System.out.println("Percentual do aumento aplicado: 15% ");
			System.out.println("Valor do aumento: " + (novoSalario - salario));
			System.out.println("Novo salário: " +  novoSalario);
		}else if (salario > 700 && salario <=1500) {
			novoSalario = salario*1.1;
			System.out.println("Salário antigo: "+ salario);
			System.out.println("Percentual do aumento aplicado: 10% ");
			System.out.println("Valor do aumento: " + (novoSalario - salario));
			System.out.println("Novo salário: " +  novoSalario);
		}else {
			novoSalario = salario*1.05;
			System.out.println("Salário antigo: "+ salario);
			System.out.println("Percentual do aumento aplicado: 5% ");
			System.out.println("Valor do aumento: " + (novoSalario - salario));
			System.out.println("Novo salário: " +  novoSalario);
		}

	}

}
