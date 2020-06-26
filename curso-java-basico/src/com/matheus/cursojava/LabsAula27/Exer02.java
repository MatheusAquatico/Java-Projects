package com.matheus.cursojava.LabsAula27;
import java.util.Scanner;
public class Exer02 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		ContaCorrente contaCorrente = new ContaCorrente();
		contaCorrente.especial=true;
		contaCorrente.limite=300;
		contaCorrente.numero= "47125-1";
		contaCorrente.saldo=100;
		
		System.out.println(contaCorrente.consultarEspecial());
		System.out.println(contaCorrente.consultarSaldo());
		contaCorrente.retirarDinheiro(200);
		System.out.println(contaCorrente.consultarSaldo());
		contaCorrente.depositarDinheiro(130);
		System.out.println(contaCorrente.consultarSaldo());
		System.out.println(contaCorrente.consultarSaldo());
		
	}

}
