package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Qual é o número que você deseja gerar a tabuada?");
		int num = scan.nextInt();
		int i =0;
		while (i<=10){
			System.out.println(num + " * " + i + "=" + (num*i));
			i++;
		}

	}

}
