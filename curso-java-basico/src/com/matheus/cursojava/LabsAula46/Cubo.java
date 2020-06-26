package com.matheus.cursojava.LabsAula46;

public class Cubo extends Figura3D {
	
	private Figura2D base;
	private double altura;
	
	public Figura2D getBase () {
		return this.base;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setBase (Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularVolume() {
		double volume=0;
		if(base instanceof Quadrado) {
			Quadrado q = (Quadrado) this.getBase();
			
			volume = this.getAltura()* (q.calcularArea());
			}
		return volume;
	}

	@Override
	public double calcularArea() {
		double area=0;
		if(base instanceof Quadrado) {
		Quadrado q = (Quadrado) this.getBase();
		area = 6* (q.calcularArea());
		}
		
		return area;
	}

}
