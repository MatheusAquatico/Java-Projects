package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantas temperaturas você quer registrar?");
		int qteTemperaturas = scan.nextInt();
		int somaTemperatura = 0;
		int maiorTemperatura=0;
		int menorTemperatura = 10000000;
		for (int i = 1;i <=qteTemperaturas; i++ ) {
			System.out.println("Temperatura " + i + ":");
			int temperatura = scan.nextInt();
			somaTemperatura +=temperatura;
			if(temperatura>maiorTemperatura) {
				maiorTemperatura=temperatura;
			}
			if(temperatura<menorTemperatura){
				menorTemperatura=temperatura;
			}
		}
		System.out.println("Menor Temperatura: " + menorTemperatura);
		System.out.println("Maior Temperatura: " + maiorTemperatura);
		System.out.println("Média das Temperaturas: " + (somaTemperatura/qteTemperaturas));
	}

}
