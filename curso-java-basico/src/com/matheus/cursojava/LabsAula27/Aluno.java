package com.matheus.cursojava.LabsAula27;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String [] disciplinas;
	double[][] medias;

	boolean verificarAprovado(int disciplina) {
		double media =0;
		boolean aprovado = false;
		for (int i = 0; i < medias[disciplina].length; i++) {
			 media += medias[disciplina][i];
			 if((media/medias[disciplina].length)>=7) {
				 aprovado = true;
			 }
		}
		return aprovado;
	}
}
