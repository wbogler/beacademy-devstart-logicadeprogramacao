package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nome;
		Float deposito;
		
		Scanner sc = new Scanner(System.in);
		
		//coleta dos dados
		System.out.println("Digite o seu nome");
		nome = sc.nextLine();
		System.out.println("Valor do deposito");
		deposito = sc.nextFloat();
		sc.close();
		
		
		Exec exercicio1 = new Exec(nome);
		exercicio1.saldo();
		exercicio1.deposito(deposito);

	}

}
