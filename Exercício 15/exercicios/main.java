package paylivre.exercicios;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	boolean valid = false;
	
	while(valid == false) {
		System.out.println("Digite seu usuário");
		String usuario = sc.next();
		System.out.println("Digite sua senha");
		String senha = sc.next();
		if((usuario.equals("Marcos")) && (senha.equals("paylivre"))) {
			System.out.println("Seja bem-vindo!");
			valid = true;
		}else {
			System.out.println("Usuário ou senha inválidos");
		}
		
	}
	

}
}
