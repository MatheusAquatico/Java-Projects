package com.matheus.cursojava.LabsAula56;

public class Exer01 {
	public static void main (String [ ]args) {
		System.out.println(Calculadora.SOMAR.executarOperacao(2.0, 2.0));
		System.out.println(Calculadora.SUBTRAIR.executarOperacao(2.0, 2.0));
		System.out.println(Calculadora.DIVIDIR.executarOperacao(2.0, 2.0));
		System.out.println(Calculadora.MULTIPLICAR.executarOperacao(2.0, 2.0));
		
		Calculadora [] calculadora = Calculadora.values();
		for(Calculadora cal : calculadora) {
			System.out.println(cal);
		}
	}

}
