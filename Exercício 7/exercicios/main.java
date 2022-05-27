package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		String nome;
		int operacao;
		float deposito;
		
		Scanner sc = new Scanner(System.in);
		
		//coleta dos dados
		System.out.println("Digite o seu nome");
		nome = sc.nextLine();
		System.out.println("Digite 1 - Saque ou 2 - deposito");
		operacao = sc.nextInt();
		Exec exercicio1 = new Exec();
		switch (operacao) {
		case 1:
			System.out.println("Saldo " + exercicio1.saldo());
			System.out.println("Digite o valor do saque");
			deposito = sc.nextFloat();
			if (exercicio1.saque(deposito) == -1000) {
				System.out.println(nome + " seu saldo é insuficiente!");
			}
			System.out.println("Novo Saldo " + exercicio1.saldo());
			deposito = 0;
			break;
		case 2:
			System.out.println("Saldo " + exercicio1.saldo());
			System.out.println("Digite o valor do deposito");
			deposito = sc.nextFloat();
			exercicio1.deposito(deposito);
			System.out.println("Novo Saldo " + exercicio1.saldo());
		default:
			break;
		}
			
		}


}
