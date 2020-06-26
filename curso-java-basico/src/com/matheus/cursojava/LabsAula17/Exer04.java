package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer04 {
	 public static void main(String [] args) {
		 Scanner scan =new Scanner (System.in);
		 int paisA =80000;
		 int paisB =200000;
		 double crescimentoA=0.03;
		 double crescimentoB=0.015;
		 for(int anos=1;paisA<paisB;anos++) {
			 paisA+= paisA*0.03;
			 paisB+= paisB*0.015;
			 if (paisA>=paisB) {
				 System.out.println("População A: " + paisA);
				 System.out.println("População A: " + paisB);
				 System.out.println(anos + " foram necessários");
			 }
		 }
	 }
}
