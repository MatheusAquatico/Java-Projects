package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int add=0;
		System.out.println("Voc� vai participar de uma investiga��o. Diga: ");
		System.out.println("Telefonou para a v�tima?");
		String resposta1 = scan.nextLine();
		if (resposta1.contentEquals("Sim")) {
			add++;
		}
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.nextLine();
		if (resposta2.contentEquals("Sim")) {
			add++;
		}
		System.out.println("Mora perto da v�tima?");
		String resposta3 = scan.nextLine();
		if (resposta3.contentEquals("Sim")) {
			add++;
		}
		System.out.println("Devia para a v�tima?");
		String resposta4 = scan.nextLine();
		if (resposta4.contentEquals("Sim")) {
			add++;
		}
		System.out.println("Trabalhou com a v�tima?");
		String resposta5 = scan.nextLine();
		if (resposta5.contentEquals("Sim")) {
			add++;
		}
		switch (add) {
		case 2: System.out.println("Suspeita"); break;
		case 3:
		case 4:System.out.println("C�mplicea"); break;
		case 5:System.out.println("Assassina"); break;
		default:System.out.println("inocente"); break;
		}
	}

}
