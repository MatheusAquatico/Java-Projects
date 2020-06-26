package com.matheus.cursojava.LabsAula35;

public class Somatorio {
	
	public static int somatorio (int num) {
		 
		if (num<2) {
			return 1;
		}else{
			return num + somatorio (num-1);
		}
	}

}
