package com.matheus.cursojava.LabsAula27;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		aluno.disciplinas = new String[3];
		aluno.medias = new double[3][4];

		System.out.println("Digite o nome do aluno:");
		aluno.nome = scan.nextLine();
		System.out.println("Digite a matrícula do aluno:");
		aluno.matricula = scan.nextLine();
		System.out.println("Digite o curso do aluno");
		aluno.curso = scan.nextLine();
		System.out.println("Digite as disciplinas cursadas:");
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println("Digite o nome da disciplina " + (i+1));
			aluno.disciplinas[i] = scan.nextLine();
		}
		System.out.println("Digite as notas das disciplinas");
		for (int i = 0; i < aluno.medias.length; i++) {
			for (int j = 0; j < aluno.medias[i].length; j++) {
				System.out.println("Digite a nota " + (j+1) + " da disciplina " + (i+1));
				aluno.medias[i][j] = scan.nextInt();
			}
		}
		System.out.println("Nome das disciplinas");
		for (int i = 0; i < aluno.disciplinas.length; i++) {
			System.out.println(aluno.disciplinas[i]);
		}
		for (int i = 0; i < aluno.medias.length; i++) {
			for (int j = 0; j < aluno.medias[i].length; j++) {
				System.out.println("Nota " + (j+1) + " da disciplina " + (i+1));
				System.out.println(aluno.medias[i][j]);
			}
		}
		if (aluno.verificarAprovado(0)) {
			System.out.println("O " + aluno.nome + " foi aprovado na disciplina " + aluno.disciplinas[0]);
		} else {
			System.out.println("O " + aluno.nome + " foi reprovado na disciplina " + aluno.disciplinas[0]);
		}
		if (aluno.verificarAprovado(1)) {
			System.out.println("O " + aluno.nome + " foi aprovado na disciplina " + aluno.disciplinas[1]);
		} else {
			System.out.println("O " + aluno.nome + " foi reprovado na disciplina " + aluno.disciplinas[1]);
		}
		if (aluno.verificarAprovado(2)) {
			System.out.println("O " + aluno.nome + " foi aprovado na disciplina " + aluno.disciplinas[2]);
		} else {
			System.out.println("O " + aluno.nome + " foi reprovado na disciplina " + aluno.disciplinas[2]);
		}
	}
}
