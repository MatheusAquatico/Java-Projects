package com.matheus.cursojava.LabsAula15;
import java.util.Scanner;
public class Exer22 {

		public static void main (String [] args) {
			Scanner scan =new Scanner (System.in);
			
			System.out.println("Seja bem vindo a fruteira! Aqui temos morangos e ma��s. Quais voc� quer? "
					+ "S� Morango, s� ma�� ou os dois?");
			String produto =scan.nextLine();
			double kgMorango=0;
			double kgMa�a=0;
			double total=0;
			double totalDesconto = 0;
			if (produto.equalsIgnoreCase("Morango")) {
				System.out.println("Quantos quilos voc� quer de morango?");
				kgMorango = scan.nextInt();
			}else if (produto.equalsIgnoreCase("Ma��")){
				System.out.println("Quantos quilos voc� quer de ma��?");
				kgMa�a = scan.nextInt();
			}else if (produto.equalsIgnoreCase("Os dois")) {
				System.out.println("Quantos quilos voc� quer de morango?");
				kgMorango = scan.nextInt();
				System.out.println("Quantos quilos voc� quer de ma��?");
				kgMa�a = scan.nextInt();
			}else {
				System.out.println("N�o vendemos isso aqui, desculpe.");
			}
			
			if (kgMorango <=5) {
				total += kgMorango * 2.5;
			}else if(kgMorango>5) {
				total += kgMorango * 2.2;
			}
			if (kgMa�a <=5) {
				total += kgMa�a * 1.8;
			}else if (kgMa�a >5) {
				total += kgMa�a * 1.8;
			}
			
			if(total<=25|| kgMorango+kgMa�a <=8) {
				System.out.println("Sua compra deu: " + total);
			}else if (total>25 || kgMorango+kgMa�a >8) {
				totalDesconto += total - (total *0.1);
				System.out.println("Sua compra deu: " + totalDesconto);
			}
		}
}
