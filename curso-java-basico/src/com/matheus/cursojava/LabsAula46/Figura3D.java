package com.matheus.cursojava.LabsAula46;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoSuperficial,DimensaoVolumetrica{
	
	private int faces;
	
	public int getFaces() {
		return this.faces;
	}
	public void setFaces(int faces) {
		this.faces=faces;
	}
	public String toString () {
		String s = super.toString();
		s+= " Faces: " + this.getFaces();
		return s;
	}

}
