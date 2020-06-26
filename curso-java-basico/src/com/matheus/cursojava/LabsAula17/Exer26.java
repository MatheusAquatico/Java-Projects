package com.matheus.cursojava.LabsAula17;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Fatorial de:");
		int fatorial = scan.nextInt();
		int resultado = fatorial;
		String frase = "" + fatorial + " .";
		for(int i = fatorial -1; i>0;i--) {
			resultado*=i;
		frase +=" " +  i ;
		if(i>1) {
		frase +=" .";
		}
		}System.out.println(fatorial+ "!" + " ="  + frase + " =" + resultado);

	}

}
