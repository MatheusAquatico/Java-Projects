package com.matheus.cursojava.LabsAula46;

public class Circulo extends Figura2D {
	
	private double raio;
	
	public double getRaio () {
		return this.raio;
	}
	
	public void setRaio (double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area=Math.PI*Math.pow((this.getRaio()), 2);
		return area;
	}

}
