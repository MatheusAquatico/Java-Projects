package com.matheus.cursojava.LabsAula20;
import java.util.Scanner;
public class Exer02 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		int maiorLinha =0;
		int menorLinha = 1000000000;
		int maiorColuna =0;
		int menorColuna = 1000000000;
		int[][] matrizInt = new int[10][10];
		for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt[i].length; j++) {
				matrizInt[i][j] = (int) (Math.random() *10);
			}
		}for (int i = 0; i < matrizInt.length; i++) {
			for (int j = 0; j < matrizInt[i].length; j++) {
				if(i==5) {
					if(matrizInt[i][j]>maiorLinha) {
						maiorLinha = matrizInt[i][j];
					}else if(matrizInt[i][j]<menorLinha){
						menorLinha = matrizInt[i][j];
					}
				}else if(j==7) {
					if(matrizInt[i][j]>maiorColuna) {
						maiorColuna = matrizInt[i][j];
					}else if(matrizInt[i][j]<menorColuna){
						menorColuna = matrizInt[i][j];
					}
				}
			}
		}
		System.out.println("O maior número da linha foi: " + maiorLinha);
		System.out.println("O menor número da linha foi: " + menorLinha);
		System.out.println("O maior número da Coluna foi: " + maiorColuna);
		System.out.println("O menor número da Coluna foi: " + menorColuna);
	}
}
