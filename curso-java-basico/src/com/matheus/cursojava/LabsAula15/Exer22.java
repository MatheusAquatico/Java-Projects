package com.matheus.cursojava.LabsAula15;
import java.util.Scanner;
public class Exer22 {

		public static void main (String [] args) {
			Scanner scan =new Scanner (System.in);
			
			System.out.println("Seja bem vindo a fruteira! Aqui temos morangos e maçãs. Quais você quer? "
					+ "Só Morango, só maçã ou os dois?");
			String produto =scan.nextLine();
			double kgMorango=0;
			double kgMaça=0;
			double total=0;
			double totalDesconto = 0;
			if (produto.equalsIgnoreCase("Morango")) {
				System.out.println("Quantos quilos você quer de morango?");
				kgMorango = scan.nextInt();
			}else if (produto.equalsIgnoreCase("Maçã")){
				System.out.println("Quantos quilos você quer de maçã?");
				kgMaça = scan.nextInt();
			}else if (produto.equalsIgnoreCase("Os dois")) {
				System.out.println("Quantos quilos você quer de morango?");
				kgMorango = scan.nextInt();
				System.out.println("Quantos quilos você quer de maçã?");
				kgMaça = scan.nextInt();
			}else {
				System.out.println("Não vendemos isso aqui, desculpe.");
			}
			
			if (kgMorango <=5) {
				total += kgMorango * 2.5;
			}else if(kgMorango>5) {
				total += kgMorango * 2.2;
			}
			if (kgMaça <=5) {
				total += kgMaça * 1.8;
			}else if (kgMaça >5) {
				total += kgMaça * 1.8;
			}
			
			if(total<=25|| kgMorango+kgMaça <=8) {
				System.out.println("Sua compra deu: " + total);
			}else if (total>25 || kgMorango+kgMaça >8) {
				totalDesconto += total - (total *0.1);
				System.out.println("Sua compra deu: " + totalDesconto);
			}
		}
}
