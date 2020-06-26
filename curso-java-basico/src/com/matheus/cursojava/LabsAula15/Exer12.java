package com.matheus.cursojava.LabsAula15;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Este programa vai calcular sua folha de pagamento. Digite seu salário "
				+ "por hora e as horas trabalhadas no mês ");
		double salarioHora = scan.nextDouble();
		int horasMes= scan.nextInt();
		double salarioBruto = salarioHora *horasMes;
		double taxaIr;
		double taxaSindicato=0.03;
		double taxaFGTS=0.11;
		double ir;
		double sindicato;
		double fgts;
		double totalDescontos;
		double salarioLiquido;
		if (salarioBruto <= 900) {
			taxaIr=0;
			ir= salarioBruto * taxaIr;
			sindicato= salarioBruto * taxaSindicato;
			fgts = salarioBruto * taxaFGTS;
			totalDescontos = ir+sindicato+fgts;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario Bruto: " + salarioBruto);
			System.out.println("IR " + taxaIr + ": "+  ir);
			System.out.println("FGTS " + taxaFGTS + ": "+  fgts);
			System.out.println("Sindicato " + taxaSindicato + ": "+  sindicato);
			System.out.println("Total de descontos: " + totalDescontos);
			System.out.println("Salario líquido: " + salarioLiquido);
		}else if(salarioBruto > 900 && salarioBruto <=1500){
			taxaIr=0.05;
			ir= salarioBruto * taxaIr;
			sindicato= salarioBruto * taxaSindicato;
			fgts = salarioBruto * taxaFGTS;
			totalDescontos = ir+sindicato+fgts;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario Bruto: " + salarioBruto);
			System.out.println("IR " + taxaIr + ": "+  ir);
			System.out.println("FGTS " + taxaFGTS + ": "+  fgts);
			System.out.println("Sindicato " + taxaSindicato + ": "+  sindicato);
			System.out.println("Total de descontos: " + totalDescontos);
			System.out.println("Salario líquido: " + salarioLiquido);
		}else if(salarioBruto > 1500 && salarioBruto <=2500){
			taxaIr=0.1;
			ir= salarioBruto * taxaIr;
			sindicato= salarioBruto * taxaSindicato;
			fgts = salarioBruto * taxaFGTS;
			totalDescontos = ir+sindicato+fgts;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario Bruto: " + salarioBruto);
			System.out.println("IR " + taxaIr + ": "+  ir);
			System.out.println("FGTS " + taxaFGTS + ": "+  fgts);
			System.out.println("Sindicato " + taxaSindicato + ": "+  sindicato);
			System.out.println("Total de descontos: " + totalDescontos);
			System.out.println("Salario líquido: " + salarioLiquido);
		}else {
			taxaIr=0.2;
			ir= salarioBruto * taxaIr;
			sindicato= salarioBruto * taxaSindicato;
			fgts = salarioBruto * taxaFGTS;
			totalDescontos = ir+sindicato+fgts;
			salarioLiquido = salarioBruto - totalDescontos;
			System.out.println("Salario Bruto: " + salarioBruto);
			System.out.println("IR " + taxaIr + ": "+  ir);
			System.out.println("FGTS " + taxaFGTS + ": "+  fgts);
			System.out.println("Sindicato " + taxaSindicato + ": "+  sindicato);
			System.out.println("Total de descontos: " + totalDescontos);
			System.out.println("Salario líquido: " + salarioLiquido);
		}
	}

}
