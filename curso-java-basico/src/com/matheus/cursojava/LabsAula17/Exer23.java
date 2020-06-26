package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer23 {
	public static void main(String [] args) {
		Scanner scan = new Scanner (System.in);	
		double preco = 1.99;
		double somatoria = preco;
		for(int i=1;i<=50;i++) {
			System.out.println(i + " - " +  "R$ " + somatoria);
			somatoria+=preco;
		}
	}
}
