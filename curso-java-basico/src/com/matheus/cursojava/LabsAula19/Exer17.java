package com.matheus.cursojava.LabsAula19;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int [] arrayA = new int [10];
		int qtepessoasMaior35 =0;
		for(int i = 0; i<arrayA.length;i++) {
			System.out.println("Digite a idade da pesso "+ (i+1));
			arrayA [i] = scan.nextInt();
			if(arrayA [i] >35) {
				qtepessoasMaior35++;
			}
		}
		System.out.println("A quantidade de pessoas maiores de 35 anos é : " + qtepessoasMaior35);
	}

}
