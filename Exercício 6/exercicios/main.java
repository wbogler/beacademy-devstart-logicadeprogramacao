package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner sc = new Scanner(System.in);
		
		//coleta dos dados
		System.out.println("Digite o seu nome");
		nome = sc.nextLine();
		System.out.println("Digite sua idade");
		idade = sc.nextInt();

		sc.close();
		
		
		Exec exercicio1 = new Exec(nome,idade);
		exercicio1.avaliaIdade();

	}

}
