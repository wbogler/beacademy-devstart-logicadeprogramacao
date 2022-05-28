package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int idade;
		int mais60 = 0;
		int menos18 = 0; 

		Scanner sc = new Scanner(System.in);
		System.out.println("Para terminar digite idade como -99");

		do {
			System.out.println("uma idade: ");
			idade = sc.nextInt();
			if(idade>60) {
				mais60++;
			}
			if(idade<18 && (idade!=-99)) {
				menos18++;
			}
						
		} while (idade!=-99);
		System.out.println("Menores de 18: "+menos18);
		System.out.println("Maiores de 60: "+mais60);
		

	}

}
