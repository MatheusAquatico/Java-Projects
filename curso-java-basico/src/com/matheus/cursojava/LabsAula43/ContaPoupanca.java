package com.matheus.cursojava.LabsAula43;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	
	public ContaPoupanca (String nomeCliente, String numConta) {
		super(nomeCliente, numConta);
	}
	
	public ContaPoupanca (ContaBancaria conta) {
		super(conta.getNomeCliente(),conta.getNumConta());
		super.depositar(conta.getSaldo());
	}
	
	public double calcularNovoSaldo(double taxa) {
		this.depositar(super.getSaldo() * taxa);
		return super.getSaldo();
	}

}
