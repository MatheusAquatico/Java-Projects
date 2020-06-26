package com.matheus.cursojava.LabsAula43;
import java.util.Scanner;
public class Exer02 {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		PessoaFisica f1 = new PessoaFisica("João",300);
		PessoaFisica f2 = new PessoaFisica("Maria",2300);
		PessoaFisica f3 = new PessoaFisica("Pedro",4300);
		PessoaJuridica j1 = new PessoaJuridica("car+", 1000);
		PessoaJuridica j2 = new PessoaJuridica("Mercado brabo", 10000);
		PessoaJuridica j3 = new PessoaJuridica("Silveira ", 200000);
		
		System.out.println(f1.toString());
		System.out.println(f2.toString());
		System.out.println(f3.toString());
		System.out.println(j1.toString());
		System.out.println(j2.toString());
		System.out.println(j3.toString());
		
	}

}
