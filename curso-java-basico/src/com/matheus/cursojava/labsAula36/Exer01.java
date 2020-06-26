package com.matheus.cursojava.labsAula36;
import java.util.Scanner;

public class Exer01 {
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Crie o nome da sua agenda: ");
		Agenda agenda = new Agenda();
		
		String nomeA = scan.nextLine();
		agenda.setNomeAgenda(nomeA);
		Contato [] cont = new Contato[3];
		for(int i = 1; i<4;i++) {
			Contato contato = new Contato();
			System.out.println("Insira as informações do contato " + i);
			System.out.println("Nome: ");
			String name = scan.nextLine();
			contato.setNome(name);
			System.out.println("Telefone: ");
			String phone = scan.nextLine();
			contato.setTelefone(phone);
			System.out.println("E-mail: ");
			String mail = scan.nextLine();
			contato.setEmail(mail);
			cont [i-1]=contato;
		}
		agenda.setContatos(cont);
		System.out.println(agenda.infoContato(1));
		System.out.println(agenda.infoContatos());
	}
}
