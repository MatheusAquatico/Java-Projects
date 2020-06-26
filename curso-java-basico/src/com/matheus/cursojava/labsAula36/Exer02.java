package com.matheus.cursojava.labsAula36;
import java.util.Scanner;
public class Exer02 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		Curso curso = new Curso();
		System.out.println("Criando professor...");
		Professor professor = new Professor();
		professor.setNome("Anjolina");
		professor.setDepartamento("Cin");
		professor.setEmail("anjo@gmail.com");
		Aluno [] al = new Aluno [5];
		System.out.println("Criando alunos...");
		for ( int i=0;i<al.length;i++) {
			al [i]=new Aluno();
			System.out.println("Digite os dados do aluno " + (i+1));
			System.out.println("Nome:");
			String name = scan.nextLine();
			al[i].setNome(name);
			System.out.println("Matricula:");
			String matri = scan.nextLine();
			al[i].setMatricula(matri);
			System.out.println("Notas:");
			double [] notas = new double [4];
			System.out.println("1º:");
			notas [0]=scan.nextDouble();
			System.out.println("2º:");
			notas [1]=scan.nextDouble();
			System.out.println("3º:");
			notas [2]=scan.nextDouble();
			System.out.println("4º:");
			notas [3]=scan.nextDouble();
			al[i].setNotas(notas);
			scan.nextLine();
		}
		curso.setAlunos(al);
		System.out.println("criando curso...");
		curso.setProfessor(professor);
		curso.setNome("lógica");
		scan.nextLine();
		curso.setHorario("ter 13:00~15:00 / quin 15:00~17:00");
		String horario =curso.getHorario();
		System.out.println(curso.getNome());
		System.out.println(horario);
		System.out.println(curso.getProfessor().getNome());
		System.out.println(curso.getProfessor().getEmail());
		System.out.println(curso.getProfessor().getDepartamento());
		double [] mediaAlunos = curso.calcularMediaAluno(al);
		for (int i = 0; i<mediaAlunos.length;i++) {
			System.out.println((i+1) + "º aluno tem média: " + mediaAlunos[i]);
			if(mediaAlunos[i]>=7) {
				System.out.println("Aprovado");
			}
		}
		System.out.println("Média da classe: " + curso.calcularMediaClasse(mediaAlunos));
	}
}
