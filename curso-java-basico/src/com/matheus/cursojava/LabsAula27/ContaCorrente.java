package com.matheus.cursojava.LabsAula27;

public class ContaCorrente {
 String numero;
 double saldo;
 boolean especial;
 double limite;
 
 void retirarDinheiro (double dinheiro) {
	 if(this.saldo>dinheiro) {
	 this.saldo -= dinheiro;
	 }else {
		System.out.println("Saldo insuficiente") ;
		if(this.consultarEspecial()) {
			if(this.limite>dinheiro) {
				this.saldo -= dinheiro;
			}else {
				System.out.println("Limite insuficiente") ;
			}
		}
	 }
 }
 void depositarDinheiro (double dinheiro) {
	 this.saldo += dinheiro;
 }
 double consultarSaldo () {
	 return saldo;
 }
 boolean consultarEspecial () {
	 return especial;
 }
}
