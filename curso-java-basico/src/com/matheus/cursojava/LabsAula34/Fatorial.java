package com.matheus.cursojava.LabsAula34;

public class Fatorial {
	public static int Fatorial (int num1) {
		if(num1==0) {
			return 1;
		}
		int soma=1;
		for (int i = num1; i>0;i--) {
			 soma *=i;
		}
		return soma;
	}
}
