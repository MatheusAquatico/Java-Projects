package com.matheus.cursojava.LabsAula33;

public class Lampada {
	private String marca;
	private String modelo;
	private double preco;
	private int watts;
	private String tipoLuz;
	private int voltagem;
	
	public void ligarLampada() {
		System.out.println("Lâmpada Ligada");
	}
	public void desligarLampada() {
		System.out.println("Lâmpada desigada");
	}
	 
	public Lampada(String marca, String modelo, double preco, int watts, String tipoLuz, int voltagem) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
		this.watts = watts;
		this.tipoLuz = tipoLuz;
		this.voltagem = voltagem;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getWatts() {
		return watts;
	}
	public void setWatts(int watts) {
		this.watts = watts;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
}
