package com.matheus.cursojava.LabsAula56;

public enum Calculadora {

	SOMAR('+') {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x+y;
		}
	},SUBTRAIR('-') {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
			
		}
	},MULTIPLICAR('*') {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x*y;
		}
	},DIVIDIR('/') {
		@Override
		public double executarOperacao(double x, double y) {
			// TODO Auto-generated method stub
			return x/y;
		}
	};
	
	public char simbolo;
	
	Calculadora(char simbolo){
		
		this.simbolo = simbolo;
	}
	
	public char getSimbolo() {
		return this.simbolo;
	}
	
	public String toString() {
		String s=""+ this.getSimbolo();
		return s;
	}
	
	public abstract double executarOperacao(double x, double y) ;

}
