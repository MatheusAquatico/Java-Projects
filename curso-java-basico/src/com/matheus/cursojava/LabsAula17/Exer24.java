package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer24 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual � o pre�o do p�o?");
		double preco = scan.nextDouble();
		double somatoria = preco;
		System.out.println("Pre�o do p�o: R$" + preco);
		for(int i=1;i<=50;i++) {
			System.out.println(i + " - " +  "R$ " + somatoria);
			somatoria+=preco;
		}
	}
}
