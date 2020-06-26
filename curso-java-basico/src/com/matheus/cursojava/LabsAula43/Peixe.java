package com.matheus.cursojava.LabsAula43;

public class Peixe extends Animal {
	
	private String caracteristicas;
	
	public String getCaracteristicas() {
		return this.caracteristicas;
	}
	public void setCaracteristicas (String caracteristicas) {
		this.caracteristicas=caracteristicas;
	}
	Peixe (){
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinza");
		this.caracteristicas="Barbatana e cauda";
	}
	

}
