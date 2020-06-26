package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer32 {

	public static void main (String [] args) {
	Scanner scan = new Scanner (System.in);	
	boolean acabou = false;
	double conta = 0;
	do {
		double preco =0;
		System.out.println("Qual é o código do pedido? ");
		int codigo = scan.nextInt();
		System.out.println("E são quantas qtes? ");
		int qte = scan.nextInt();
		switch (codigo) {
		case 100:
			preco = 1.20;
			break;
		case 101:
			preco = 1.30;
			break;
		case 102:
			preco = 1.50;
			break;
		case 103:
			preco = 1.20;
			break;
		case 104:
			preco = 1.30;
			break;
		case 105:
			preco= 1.00;
			break;
		}
		conta += (preco * qte);
		
		System.out.println("Acabou o pedido? ");
		scan.nextLine();
		String resposta = scan.nextLine();
		if (resposta.equals("Sim")) {
			acabou = true;
		}else {
			
		}
	}while (!acabou);
	System.out.println("A conta deu: " + conta);
	}
}
