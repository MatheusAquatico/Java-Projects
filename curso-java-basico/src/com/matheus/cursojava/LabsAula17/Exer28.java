package com.matheus.cursojava.LabsAula17;
import java.util.Scanner;
public class Exer28 {
	public static void main (String [] args) {
		Scanner scan = new Scanner (System.in);
		boolean primo = true;
		do{
			primo = true;
		System.out.println("Digite um n�mero inteiro: ");
		
		int num = scan.nextInt();
		for (int i =2;i<num;i++) {
			if(num%i==0) {
				primo = false;
				
			}
		}
		
		if (primo) {
			System.out.println("Seu n�mero � primo!");
		}
		else {
			System.out.println("Seu n�mero n�o � primo!");
		}
		}while(!primo);
		
	}
}
