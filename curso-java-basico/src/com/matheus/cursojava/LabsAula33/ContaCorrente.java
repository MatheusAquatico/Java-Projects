package com.matheus.cursojava.LabsAula33;

public class ContaCorrente {
	private String numero;
	private double saldo;
	private String status;
	private double limite;
	private String agencia;
	private boolean especial;
	
	ContaCorrente(String numero, String agencia, String status, double saldo, double limite,boolean especial ) {
		
	}
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public boolean isEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public void retirarDinheiro(double dinheiro) {
		if (this.getSaldo() > dinheiro) {
			this.saldo -= dinheiro;
		} else {
			System.out.println("Saldo insuficiente");
			if (this.consultarEspecial()) {
				if (this.getLimite() > dinheiro) {
					this.saldo -= dinheiro;
				} else {
					System.out.println("Limite insuficiente");
				}
			}
		}
	}

	public void depositarDinheiro(double dinheiro) {
		this.saldo += dinheiro;
	}

	public double consultarSaldo() {
		return saldo;
	}

	public boolean consultarEspecial() {
		return especial;
	}
}
