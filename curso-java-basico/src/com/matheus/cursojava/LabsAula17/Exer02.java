package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Escreva seu nome de usuário e senha: ");
		String nome="";
		String senha="";
		do{
			System.out.println("Nome de usuário: ");
		 nome =scan.nextLine();
			System.out.println("Senha: ");
			 senha =scan.nextLine();
		}while (nome.equalsIgnoreCase(senha));
		System.out.println("Login efetuado!");
	}

}
