package com.matheus.cursojava.LabsAula43;
import java.util.Scanner;
public class Exer01 {
	
	
	public static void main (String []args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Seja bem vindo! Qual seu nome?");
		String nome = scan.nextLine();
		System.out.println("Qual é o número desejado da conta?");
		String numConta = scan.nextLine();
		System.out.println("Qual tipo de conta você quer?");
		System.out.println("1- Conta Simples");
		System.out.println("2- Conta Poupança");
		System.out.println("3- Conta Especial");
		
		int tipo = scan.nextInt();
		
		ContaBancaria conta = null;
		switch (tipo) {
		case 1:
			System.out.println("Criando conta Simples...");
			conta = new ContaBancaria (nome,numConta);
			System.out.println("Sua conta Simples foi criada com sucesso!");
			break;
		case 2:
			System.out.println("Criando conta Poupança...");
			conta = new ContaPoupanca (nome,numConta);
			System.out.println("Sua conta Poupanca foi criada com sucesso!");
			break;
		case 3:
			System.out.println("Criando conta Especial...");
			conta = new ContaEspecial(nome,numConta);
			System.out.println("Sua conta Especial foi criada com sucesso!");
			break;
		}
		int opcao =0;
		do {
			System.out.println("O que você deseja fazer agora?");
			System.out.println("1- Sacar");
			System.out.println("2- Depositar");
			System.out.println("3- Render ");
			System.out.println("4- Mostrar dados do cliente");
			System.out.println("5- Sair");
			opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Digite a quantia a ser sacada: ");
			double sacar = scan.nextInt();
			if (sacar <=conta.getSaldo()) {
			System.out.println("Seu saldo após a retirada: "+ conta.sacar(sacar));
			}else {
				ContaEspecial contaEspecial = new ContaEspecial (conta);
				System.out.println("Seu saldo e limite após a retirada: "+ contaEspecial.sacar(sacar));
			}
			break;
		case 2:
			System.out.println("Digite a quantia a ser depositada: ");
			double depositar = scan.nextInt();
			System.out.println("Seu saldo após o depósito: "+ conta.depositar(depositar));
			break;
		case 3:
			System.out.println("Qual foi a taxa de rendimento do mês?");
			double taxa = scan.nextDouble();
			System.out.println("Rendendo conta...");
			ContaPoupanca contaPoupanca = new ContaPoupanca(conta);
			System.out.println("Seu saldo após o rendimento: "+ contaPoupanca.calcularNovoSaldo(taxa));
			break;
		case 4:
			String s =conta.toString();
			System.out.println(s);
			break;
		}
		}while(opcao!=5);
			
		
	}

}
