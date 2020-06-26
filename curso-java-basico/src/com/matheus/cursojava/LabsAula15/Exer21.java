package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Olá! O combustível é álcool ou gasolina?");
		char combustivel = scan.nextLine().charAt(0);
		System.out.println("Quantos litros?");
		double litros = scan.nextDouble();
		double preco =0;
		double total =0;
		switch (combustivel) {
		case 'á':
		case 'Á':
			if(litros<=20) {
			preco =(litros *1.9); 
			total = preco - preco*0.03;	
			}else {
				preco =(litros *1.9); 
				total = preco - preco*0.05;	
			}System.out.println("Total: " + total);break;
		case 'g':
		case 'G':
			if(litros<=20) {
				preco =(litros *2.5); 
				total = preco - preco*0.04;	
				}else {
					preco =(litros *1.9); 
					total = preco - preco*0.06;	
				}System.out.println("Total: " + total);break;
		}
	}

}
