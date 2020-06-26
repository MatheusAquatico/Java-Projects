package com.matheus.cursojava.LabsAula33;


public class Exer03 {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		

		System.out.println("Digite o nome do aluno:");
		aluno.setNome ("Matheus") ;
		System.out.println("Digite a matrícula do aluno:");
		aluno.setMatricula("32947683248");
		System.out.println("Digite o curso do aluno");
		aluno.setCurso ("CC");
		System.out.println("Digite as disciplinas cursadas:");
		String [] array = {"s","d","g"};
		aluno.setDisciplinas(array);
		System.out.println("Digite as notas das disciplinas");
		double [] [] arrayNum = {{10,8,6,4},{3,10,4,1},{1,10,10,10}};
		aluno.setMedias(arrayNum);
		System.out.println(aluno.getNome());
		System.out.println(aluno.getCurso());
		System.out.println(aluno.getMatricula());
		System.out.println(aluno.getDisciplinas()[0]);
		System.out.println("Digite as disciplinas cursadas:");
		aluno.getDisciplinas();
		aluno.getMedias();
		if (aluno.verificarAprovado(0)) {
			System.out.println("O " + aluno.getNome() + " foi aprovado na disciplina " + aluno.getDisciplinas()[0]);
		} else {
			System.out.println("O " + aluno.getNome() + " foi reprovado na disciplina " + aluno.getDisciplinas()[0]);
		}
		if (aluno.verificarAprovado(1)) {
			System.out.println("O " + aluno.getNome() + " foi aprovado na disciplina " + aluno.getDisciplinas()[1]);
		} else {
			System.out.println("O " + aluno.getNome() + " foi reprovado na disciplina " + aluno.getDisciplinas()[1]);
		}
		if (aluno.verificarAprovado(2)) {
			System.out.println("O " + aluno.getNome() + " foi aprovado na disciplina " + aluno.getDisciplinas()[2]);
		} else {
			System.out.println("O " + aluno.getNome() + " foi reprovado na disciplina " + aluno.getDisciplinas()[2]);
		}
	}
}


	


