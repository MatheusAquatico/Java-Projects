package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Este programa irá fornecer as raízes da equação do segundo grau na forma ax2 + bx + c ao informar seus respectivos valores: ");
		System.out.println("Digite o valor de a: ");
		int a = scan.nextInt();
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau ");
			
		}else {
			System.out.println("Digite o valor de b: ");
			int b = scan.nextInt();
			System.out.println("Digite o valor de c: ");
			int c = scan.nextInt();
			if (b*b-4*a*c<0) {
				System.out.println("Não possui raízes reais");
			}else if (Math.pow(b, 2)-4*a*c==0){
				System.out.println("Possui apenas uma raíz real");
				double raiz = (-b+Math.sqrt((b*b-4*a*c)))/2*a;
				System.out.println("A raíz é: "+ raiz);
			}else {
				double raiz1 = (-b+Math.sqrt(b*b-4*a*c))/2*a;
				double raiz2 = (-b-Math.sqrt(b*b-4*a*c))/2*a;
				System.out.println("A raíz é: "+ raiz1);
				System.out.println("E: "+ raiz2);
			}
		}
		
	}

}
