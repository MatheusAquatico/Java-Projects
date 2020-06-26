package com.matheus.cursojava.LabsAula52;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teste1 {
	public static void main(String[] args) {
		boolean sair = false;
		Scanner scan = new Scanner(System.in);
		Agenda agenda = new Agenda();
		while (!sair){
			System.out.println("Seja bem vindo a sua agenda!");
			System.out.println("----------------------------");
			System.out.println("1-      Consultar um contato");
			System.out.println("2-      Adicionar um contato");
			System.out.println("0-                      Sair");
			System.out.println("Digite a opção desejada:");
			int opcao = scan.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Informe a id desejada:");
				try {
					int id = scan.nextInt();

					Contato c = agenda.consultarContato(id);
					if (c.equals(null)) {
						throw new ContatoNaoExisteException(id);
					}
					System.out.println(c.toString());

				} catch (ContatoNaoExisteException e) {
					System.out.println(e.toString());

				}catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				} 
				break;
			case 2:
				try {
					System.out.println("Digite o nome do contato:");
					scan.nextLine();
					String nome = scan.nextLine();
					System.out.println("Digite o número do contato:");
					String num = scan.nextLine();
					
					

					agenda.adicionarContato(nome, num);
					if (agenda.getPonteiro() >= agenda.getContatos().length) {
						throw new AgendaCheiaException(agenda);

					}
					System.out.println("Seu contato foi criado com sucesso! A sua id é:" 
							+ agenda.adicionarContato(nome, num) );
				} catch (AgendaCheiaException e) {
					System.out.println(e.toString());
				} catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				} 
				break;
			case 0:
				sair = true;
				break;
			}
		} 

	}
}
