package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		String usuario = "";
		int senha;

		Scanner sc = new Scanner(System.in);
		System.out.println("Para encerrar digite -1 no usuário");
		Exec valid = new Exec();

		do {
			System.out.println("Digite o usuário: ");
			usuario = sc.next();
			System.out.println("Digite a senha: ");
			senha = sc.nextInt();
			if (valid.usuario(usuario)&&(valid.senha(senha))) {
				System.out.println("Acesso liberado");
				usuario = "-1";
			}
				
			
		} while (usuario != "-1");
		

	}

}
