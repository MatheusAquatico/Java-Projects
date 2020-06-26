package com.matheus.cursojava.LabsAula43;

public class PessoaJuridica extends Contribuinte{
	PessoaJuridica(String nome,double renda){
		this.setNome(nome);
		this.setRendaBruta(renda);
	}

	public double calcularImposto(double rendaBruta) {
		return rendaBruta*0.1;
	}
	

}
