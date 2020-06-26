package com.matheus.cursojava.LabsAula33;

import java.util.Scanner;


public class Exer02 {
	public static void main (String [] args) {
		ContaCorrente contaCorrente = new ContaCorrente("8748963-1", "13243","ativada",10, 500, false);
		contaCorrente.setEspecial(true);
		contaCorrente.setLimite(300);
		contaCorrente.setNumero("47125-1");
		contaCorrente.setSaldo(100);
		
		System.out.println(contaCorrente.consultarEspecial());
		System.out.println(contaCorrente.consultarSaldo());
		contaCorrente.retirarDinheiro(200);
		System.out.println(contaCorrente.consultarSaldo());
		contaCorrente.depositarDinheiro(130);
		System.out.println(contaCorrente.consultarSaldo());
		System.out.println(contaCorrente.consultarSaldo());
		
	}

}


