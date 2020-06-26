package com.matheus.cursojava.LabsAula24;
import java.util.Scanner;
public class Exer04 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		LivroBiblioteca livroBiblioteca= new LivroBiblioteca ();
		livroBiblioteca.titulo="Do Mil ao Milhão. Sem Cortar o Cafezinho";
		livroBiblioteca.autor="Thiago Nigro";
		livroBiblioteca.editora="HarperCollins";
		livroBiblioteca.Idioma="Portuguuês";
		livroBiblioteca.numPaginas=192;
		livroBiblioteca.codigo = "B87354";
		livroBiblioteca.socioAtual= "Mariana";
		livroBiblioteca.multa=0;
	}
}
