package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int operacao;
		float num1;
		float conta;
		float agencia;
		String banco;
		boolean valid = true;

		Scanner sc = new Scanner(System.in);

		while (valid == true) {
			Exec exercicio1 = new Exec();
			System.out.println("Digite 1 para transferir");
			System.out.println("Digite 2 para depositar");
			System.out.println("Digite 3 para sacar");
			System.out.println("Digite 4 para empréstimo");
			System.out.println("Digite 5 sair");
			operacao = sc.nextInt();
			if (operacao == 1) {
				System.out.println("Seu saldo: " + exercicio1.saldo());
				System.out.println("Digite o banco: ");
				banco = sc.next();
				System.out.println("Digite a agencia: ");
				agencia = sc.nextFloat();
				System.out.println("Digite a conta: ");
				conta = sc.nextFloat();
				System.out.println("Digite o valor");
				num1 = sc.nextFloat();
				exercicio1.transfer(num1);
				System.out.println("valor transferido para:");
				System.out.println("Banco: " + banco);
				System.out.println("Agencia: " + agencia);
				System.out.println("Conta: " + conta);
				System.out.println("Seu saldo: " + exercicio1.saldo());
			} else if (operacao == 2) {
				System.out.println("Seu saldo: " + exercicio1.saldo());
				System.out.println("Digite o valor");
				num1 = sc.nextFloat();
				System.out.println("Novo saldo: " + exercicio1.deposito(num1));
			} else if (operacao == 3) {
				System.out.println("Seu saldo: " + exercicio1.saldo());
				System.out.println("Digite o valor");
				num1 = sc.nextFloat();
				float autor = exercicio1.saque(num1);
				if (autor != -1000) {
					System.out.println("Saque autorizado");
					System.out.println("Saldo: " + autor);
				}

			}else if (operacao == 4) {
				System.out.println("Seu saldo: " + exercicio1.saldo());
				System.out.println("Digite o valor do empréstimo");
				num1 = sc.nextFloat();
				System.out.println("Novo saldo: " + exercicio1.deposito(num1));
			}else if (operacao == 5) {
				System.out.println("Encerrando!");
				valid = false;
			}
		}

	}

}
