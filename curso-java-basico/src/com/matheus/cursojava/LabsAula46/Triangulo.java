package com.matheus.cursojava.LabsAula46;

public class Triangulo extends Figura2D {
	private double lado1;
	private double lado2;
	private double base;
	private double altura;
	private double senA;

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado1() {
		return this.lado1;
	}
	public void setLado1(double lado1) {
		this.lado1=lado1;
	}

	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	@Override
	public double calcularArea() {
		double area=0;
		if(this.lado1==this.lado2 && this.lado1 == this.base && this.lado2 ==this.base) {
			area =( Math.pow(lado1, 2) * Math.sqrt(3))/4;
		}else if (this.lado1 == this.lado2 && this.lado1 != this.base || this.lado2 == this.base && this.lado2!=this.lado1) {
			area =(base*altura)/2;
		}else {
			area = ((base*lado2)/2) * senA;
		}
	
		return area;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getSenA() {
		return senA;
	}
	public void setSenA(double senA) {
		this.senA = senA;
	}

}
