package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome = "";
		boolean nomeValido = false;
		while (!nomeValido) {
			System.out.println("Escreva o seu nome: ");
			nome = scan.nextLine();
			if (nome.length() <= 3) {
				System.out.println("Por favor, seu nome precisa ser maior que 3 caracteres.");
			} else {
				nomeValido = true;
			}
		}
		int idade = 0;
		boolean idadeValida = false;
		while (!idadeValida) {
			System.out.println("Escreva sua idade: ");
			idade = scan.nextInt();
			if (idade <= 0 || idade >= 150) {
				System.out.println("Por favor, sua idade precisa ser entre 0 e 150.");
			} else {
				idadeValida = true;
			}
		}
		double salario = 0;
		boolean salarioValido = false;
		while (!salarioValido) {
			System.out.println("Escreva seu salario: ");
			salario = scan.nextDouble();
			if (salario <= 0) {
				System.out.println("Por favor, seu salário precisa ser positivo.");
			} else {
				salarioValido = true;
			}
		}
		scan.nextLine();
		char sexo=' ';
		boolean sexoValido = false;
		while (!sexoValido) {
			System.out.println("Escreva seu sexo: ");
			sexo = scan.nextLine().charAt(0);
			if (sexo!='f' && sexo !='m') {
				System.out.println("Por favor, seu sexo precisa ser válido.");
			} else {
				sexoValido = true;
			}
		}char civil=' ';
		boolean civilValido = false;
		while (!civilValido) {
			System.out.println("Escreva seu estado civil: ");
			civil = scan.nextLine().charAt(0);
			if (civil !='s' && civil !='c' && civil !='v' && civil !='d') {
				System.out.println("Por favor, seu estado civil precisa ser válido.");
			} else {
				civilValido = true;
			}
		}System.out.println("Seus dados: " + nome + "\n" + idade + "\n" + salario + "\n" + sexo + "\n"+ civil);
	}

}
