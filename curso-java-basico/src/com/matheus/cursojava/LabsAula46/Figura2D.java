package com.matheus.cursojava.LabsAula46;

public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial  {
	private int lados;
	
	public int getLados() {
		return this.lados;
	}
	public void setLados(int lados) {
		this.lados=lados;
	}
	public String toString () {
		String s = super.toString();
		s+= " Lados: " + this.getLados();
		return s;
	}
}
