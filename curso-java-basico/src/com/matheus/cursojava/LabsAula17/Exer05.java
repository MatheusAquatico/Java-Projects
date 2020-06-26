package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		boolean infoValida = false;
		while(!infoValida) {
		System.out.println("Digite a população do país A: ");
		 int paisA =scan.nextInt();
		 System.out.println("Digite a população do país B: ");
		 int paisB =scan.nextInt();
		 System.out.println("Digite a taxa de crescimento do país A: ");
		 double crescimentoA=scan.nextDouble();
		 System.out.println("Digite a taxa de crescimento do país B: ");
		 double crescimentoB=scan.nextDouble();
		 infoValida = true;
		 for(int anos=1;paisA<paisB;anos++) {
			 paisA+= paisA*crescimentoA;
			 paisB+= paisB*crescimentoB;
			 if (paisA>=paisB) {
				 System.out.println("População A: " + paisA);
				 System.out.println("População A: " + paisB);
				 System.out.println(anos + " anos foram necessários");
				 scan.nextLine();
				 System.out.println("Quer repetir a operação?");
				 String resposta = scan.nextLine();
				 if(resposta.equalsIgnoreCase("sim")) {
					 infoValida = false;
					 
				 }
			 }
		 }
		}
	}

}
