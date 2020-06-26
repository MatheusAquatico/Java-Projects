package com.matheus.cursojava.LabsAula43;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	ContaBancaria (String nomeCliente, String numConta){
		this.saldo=0;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	private void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	public double sacar (double quantia) {
		if (quantia<=this.saldo) {
			this.setSaldo(this.saldo-quantia);
			return this.saldo;
		}else {
			this.setSaldo(0);
			return 0;
		}
	}public double depositar (double quantia) {
		this.setSaldo(this.saldo+quantia);
		return this.saldo;
	}

}
