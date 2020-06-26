package com.matheus.cursojava.LabsAula33;

public class Exer01 {
	public static void main(String[] args) {
		Lampada lampada = new Lampada("Philips", "Incandescente", 9.99, 127, "Branca", 25);
		String marca = lampada.getMarca();
		System.out.println(marca);
		lampada.setMarca("Arno");
		double preco = lampada.getPreco();
		System.out.println(preco);
		lampada.setPreco(25.0);

	}
}
