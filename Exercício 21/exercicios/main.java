package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int ciclo = 0;
		float saldo = 1000;
		float saque = 150;
		
		do {
			saldo = saldo-saque;
			ciclo++;
			
		} while (saldo>saque);
		System.out.println("Saldo: "+ saldo);
		System.out.println("Saques: "+ ciclo);
		

	}

}
