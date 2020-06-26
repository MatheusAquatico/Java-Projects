package com.matheus.cursojava.LabsAula46;

public class Piramide extends Figura3D  {

	private Figura2D base;
	private double altura;
	private double geratriz;

	public double getGeratriz() {
		return geratriz;
	}

	public void setGeratriz(double geratriz) {
		this.geratriz = geratriz;
	}

	public Figura2D getBase() {
		return this.base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	public void setAltura (double altura) {
		this.altura = altura;
	}
	public double calcularArea() {
		double area=0;
		if(base instanceof Quadrado) {
			Quadrado b = (Quadrado)this.getBase();
			area = b.calcularArea() +  (4*((b.getLado()*this.getGeratriz())/2));
		}else if(base instanceof Triangulo) {
			Triangulo b = (Triangulo)this.getBase();
			area = b.calcularArea() +  (3*((b.getLado1()*this.getGeratriz())/2));
		}else if(base instanceof Circulo) {
			Circulo b = (Circulo)this.getBase();
			area = b.calcularArea() + this.getGeratriz()*Math.PI*Math.pow(b.getRaio(), 2);
		}
		return area;
		
	}

	@Override
	public double calcularVolume() {
		double volume=0;
		if(base instanceof Quadrado) {
			Quadrado b = (Quadrado)this.getBase();
			volume = (b.calcularArea() * this.getAltura())/3;
		}else if(base instanceof Triangulo) {
			Triangulo b = (Triangulo)this.getBase();
			volume = (b.calcularArea() * this.getAltura())/3;
		}else if(base instanceof Circulo) {
			Circulo b = (Circulo)this.getBase();
			volume =(b.calcularArea() * this.getAltura())/3;
		}
		return volume;
	}
}
