package com.matheus.cursojava.LabsAula19;
import java.util.Scanner;
public class Exer19 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		double [] notasAlunos1 = new double [10];
		double [] notasAlunos2 = new double [10];
		double [] resultado = new double [10];
		for (int i = 0;i<notasAlunos1.length;i++) {
			System.out.println("Digite a primeira nota do aluno " + (i+1));
			notasAlunos1 [i] = scan.nextDouble();
			System.out.println("Digite a segunda nota do aluno "+ (i+1));
			notasAlunos2 [i] = scan.nextDouble();
		}
		for(int j = 0;j<notasAlunos1.length;j++) {
			resultado [j]=(notasAlunos1 [j] + notasAlunos2 [j])/2;
		}
		for(int k = 0;k<notasAlunos1.length;k++) {
			if(resultado [k] >=7) {
				System.out.println("O aluno " + (k+1) + " está aprovado");
			}else {
				System.out.println("O aluno " + (k+1) + " está reprovado");
			}
		}
	}
}
