package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(
				"Seja bem vindo ao Hipermercado tabajara! Aqui temos promo��es das carnes: Fil� duplo, Alcatra e Picanha. Cada cliente pode escolher um tipo de carne."
						+ " Quais voc� quer?");
		String produto = scan.nextLine();
		double kgCarne = 0;
		double total = 0;
		double totalDesconto = 0;
		String carne = "";
		if (produto.equalsIgnoreCase("Fil� duplo")) {
			System.out.println("Quantos quilos voc� quer de Fil� duplo?");
			kgCarne = scan.nextDouble();
			carne = "Fil� duplo";
			if (kgCarne <= 5) {
				total += kgCarne * 4.9;
			} else if (kgCarne > 5) {
				total += kgCarne * 5.8;
			}
		} else if (produto.equalsIgnoreCase("Alcatra")) {
			System.out.println("Quantos quilos voc� quer de Fil� duplo?");
			kgCarne = scan.nextDouble();
			carne = "Alcatra";
			if (kgCarne <= 5) {
				total += kgCarne * 5.9;
			} else if (kgCarne > 5) {
				total += kgCarne * 6.8;
			}
		} else if (produto.equalsIgnoreCase("Picanha")) {
			System.out.println("Quantos quilos voc� quer de Picanha?");
			kgCarne = scan.nextDouble();
			carne = "Picanha";
			if (kgCarne <= 5) {
				total += kgCarne * 6.9;
			} else if (kgCarne > 5) {
				total += kgCarne * 7.8;
			}
		} else {
			System.out.println("N�o vendemos isso aqui, desculpe.");
		}
			
			System.out.println("Voc� vai pagar com dinheiro ou cart�o?");
			scan.nextLine();
			String pagamento =scan.nextLine();
			if (pagamento.equalsIgnoreCase("Dinheiro")) {
				System.out.println("Tipo de carne: " + carne);
				System.out.println("Quantidade de carne: " + kgCarne);
				System.out.println("Pre�o total: " + total);
				System.out.println("Tipo de pagamento: Dinheiro");
				System.out.println("Valor do desconto: 0%");
				System.out.println("Valor a pagar: " + total);
				
			}else if (pagamento.equalsIgnoreCase("Cart�o")) {
				System.out.println("Tipo de carne: " + carne);
				System.out.println("Quantidade de carne: " + kgCarne);
				System.out.println("Pre�o total: " + total);
				System.out.println("Tipo de pagamento: Cart�o");
				System.out.println("Valor do desconto: 5%");
				System.out.println("Valor a pagar: " + (total- (total *0.05)));
				
			}else {
				System.out.println("N�o aceitamos esse tipo de pagamento");
			}
		}
		}

