package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		boolean infoValida = false;
		while(!infoValida) {
		System.out.println("Digite a popula��o do pa�s A: ");
		 int paisA =scan.nextInt();
		 System.out.println("Digite a popula��o do pa�s B: ");
		 int paisB =scan.nextInt();
		 System.out.println("Digite a taxa de crescimento do pa�s A: ");
		 double crescimentoA=scan.nextDouble();
		 System.out.println("Digite a taxa de crescimento do pa�s B: ");
		 double crescimentoB=scan.nextDouble();
		 infoValida = true;
		 for(int anos=1;paisA<paisB;anos++) {
			 paisA+= paisA*crescimentoA;
			 paisB+= paisB*crescimentoB;
			 if (paisA>=paisB) {
				 System.out.println("Popula��o A: " + paisA);
				 System.out.println("Popula��o A: " + paisB);
				 System.out.println(anos + " anos foram necess�rios");
				 scan.nextLine();
				 System.out.println("Quer repetir a opera��o?");
				 String resposta = scan.nextLine();
				 if(resposta.equalsIgnoreCase("sim")) {
					 infoValida = false;
					 
				 }
			 }
		 }
		}
	}

}
