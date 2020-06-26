package com.matheus.cursojava.LabsAula43;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;
	
	public ContaEspecial(String nomeCliente, String numConta) {
		super(nomeCliente, numConta);
		// TODO Auto-generated constructor stub
	}
	public ContaEspecial(ContaBancaria conta) {
		super(conta.getNomeCliente(), conta.getNumConta());
		super.depositar(conta.getSaldo());
	}
	
	public double sacar (double quantia, double limite) {
		if(quantia > this.getSaldo() && quantia < (this.getSaldo() + limite)) {
			super.sacar(quantia-this.getSaldo());
			this.limite=(limite -(quantia-this.getSaldo()));
			return this.limite;
		}else {
			this.sacar(quantia-this.getSaldo());
			this.limite=0;
			return this.limite;
		}
	}
 
}
