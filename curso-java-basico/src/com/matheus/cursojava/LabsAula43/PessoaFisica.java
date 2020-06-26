package com.matheus.cursojava.LabsAula43;

public class PessoaFisica extends Contribuinte {
	PessoaFisica(String nome,double renda){
		this.setNome(nome);
		this.setRendaBruta(renda);
	}
	public double calcularImposto(double rendaBruta) {
		double dinheiro;
		if(rendaBruta<=1400) {
			dinheiro=0;
		}else if (rendaBruta>1400 && rendaBruta<2100) {
			dinheiro=(rendaBruta*0.1)-100;
		}else if (rendaBruta>2100 && rendaBruta<2800) {
			dinheiro=(rendaBruta*0.15)-270;
		}else if (rendaBruta>2800 && rendaBruta<3600) {
			dinheiro=(rendaBruta*0.25)-500;
		}else {
			dinheiro=(rendaBruta*0.3)-700;
		}
		return dinheiro;
	}

}
