package com.matheus.cursojava.LabsAula46;

public class Exer01 {
	public static void main (String []args) {
	Circulo circulo = new Circulo();
	circulo.setCor("vermelho");
	circulo.setLados(0);
	circulo.setNome("Circulo");
	Cubo cubo = new Cubo ();
	cubo.setCor("Azul");
	cubo.setFaces(6);
	cubo.setNome("Cubo");
	System.out.println(circulo.toString());
	System.out.println(cubo.toString());
	circulo.setRaio(2.0);
	System.out.println(circulo.calcularArea());
	cubo.setAltura(3);
	Quadrado quadrado = new Quadrado();
	quadrado.setLado(2);
	cubo.setBase(quadrado);
	System.out.println(cubo.calcularArea());
	System.out.println(cubo.calcularVolume());
	Cilindro cilindro = new Cilindro();
	cilindro.setCor("cinza");
	cilindro.setNome("Cilindro");
	cilindro.setFaces(2);
	cilindro.setComprimento(4);
	cilindro.setBase(circulo);
	System.out.println(cilindro.calcularArea());
	System.out.println(cilindro.calcularVolume());
	Piramide piramide = new Piramide();
	piramide.setNome("Piramide");
	piramide.setCor("Laranja");
	piramide.setAltura(3);
	piramide.setFaces(5);
	piramide.setGeratriz(4);
	piramide.setBase(quadrado);
	Triangulo triangulo = new Triangulo();
	triangulo.setNome("Triângulo");
	triangulo.setCor("Rosa");
	triangulo.setAltura(2);
	triangulo.setBase(3);
	triangulo.setLado1(2);
	triangulo.setLado2(2);
	triangulo.setLados(3);
	triangulo.setSenA(1/2);
	
	FiguraGeometrica [] figuras = new FiguraGeometrica [6];
	figuras [0]=cilindro;
	figuras [1]=circulo;
	figuras [2]=cubo;
	figuras [3]=piramide;
	figuras [4]=quadrado;
	figuras [5]=triangulo;
	
	for (FiguraGeometrica  figura :figuras ) {
		if (figura instanceof Figura2D) {
			Figura2D item = (Figura2D) figura;
			System.out.println(item.calcularArea());
		}
		if (figura instanceof Figura3D) {
			Figura3D item = (Figura3D) figura;
			System.out.println(item.calcularArea());
			System.out.println(item.calcularVolume());
		}
	}
	
	}
}
