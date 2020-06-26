package com.matheus.cursojava.LabsAula46;

public class Cilindro extends Figura3D {
	
	private Figura2D base;
	
	private double comprimento;

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}
	
	public double getComprimento () {
		return this.comprimento;
		
	}
	public void setComprimento (double comprimento) {
		this.comprimento = comprimento;
	}
	
	public double calcularArea() {
		double area=0;
		if(base instanceof Circulo) {
		Circulo b=	(Circulo)this.getBase();
		area= ((2*Math.PI*b.getRaio())*comprimento)+2*(b.calcularArea());
		}
		return area;
	}

	@Override
	public double calcularVolume() {
		double volume=0;
		if(base instanceof Circulo) {
			Circulo b=	(Circulo)this.getBase();
			volume= (comprimento*b.calcularArea());
			}
		return volume;
	}

}
