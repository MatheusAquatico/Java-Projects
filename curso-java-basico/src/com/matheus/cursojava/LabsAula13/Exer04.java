package com.matheus.cursojava.LabsAula13;
import java.util.Scanner;
public class Exer04 {

	public static void main (String args []) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite as notas do aluno para mostrar a média: ");
		System.out.println("Nota 1: ");
		double nota1= scan.nextDouble();
		System.out.println("Nota 2: ");
		double nota2= scan.nextDouble();
		System.out.println("Nota 3: ");
		double nota3= scan.nextDouble();
		System.out.println("Nota 4: ");
		double nota4= scan.nextDouble();
		double media= ((nota1 + nota2 + nota3 + nota4) /4);
		System.out.println("A média do aluno é: " +  media );

	}
}
