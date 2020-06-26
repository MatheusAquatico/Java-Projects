package com.matheus.cursojava.LabsAula24;

public class Exer03 {

	public static void main(String[] args) {
		livroDeLivraria livro= new livroDeLivraria ();
		livro.titulo="Do Mil ao Milhão. Sem Cortar o Cafezinho";
		livro.autor="Thiago Nigro";
		livro.editora="HarperCollins";
		livro.Idioma="Portuguuês";
		livro.numPaginas=192;
		livro.peso = 381;
		livro.dimensoes=new double[3];
		livro.dimensoes [0]=22.8;
		livro.dimensoes [1]=15.2;
		livro.dimensoes  [2]=1.6;
		livro.preco=22.90;
		livro.frete=0;

	}

}
